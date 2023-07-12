import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        double fiyat, kdvOran1= 0.18 , kdvOran2= 0.08, kdvFiyat1, kdvFiyat2;

        Scanner input = new Scanner(System.in);

        System.out.print("Hesaplanacak Fiyatı Giriniz: ");
        fiyat=input.nextDouble();

        kdvFiyat1= fiyat * kdvOran1;
        kdvFiyat2= fiyat * kdvOran2;

        boolean sonuc = fiyat <= 1000;

        String str = sonuc ? "KDV Tutarı: "+ kdvFiyat1 :"KDV tutarı "+ kdvFiyat2;
        System.out.print(str);












    }
}
