import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mesafe, yasBilgi, tarife;
        double kmUcret = 0.1, yasIndirim, tarifeIndirim, ucret;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM türünden giriniz! ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz! ");
        yasBilgi = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tarife = input.nextInt();

        if (mesafe > 0 && yasBilgi > 0 && tarife > 0 && tarife <= 2) {
            if (yasBilgi < 12) {
                yasIndirim = 0.5;
            } else if (yasBilgi <= 24) {
                yasIndirim = 0.9;
            } else if (yasBilgi <= 64) {
                yasIndirim = 1;
            } else {
                yasIndirim = 0.7;
            }
            if (tarife == 1) {
                tarifeIndirim = 1;
            } else {
                tarifeIndirim = 0.8;
                mesafe *= 2;
            }
            ucret = kmUcret * mesafe * yasIndirim * tarifeIndirim;
            System.out.println("Bilet Ücretiniz : " + ucret + " TL");
        } else {
            System.out.println("Hatalı bilgi girdiniz!");
        }
    }
}
