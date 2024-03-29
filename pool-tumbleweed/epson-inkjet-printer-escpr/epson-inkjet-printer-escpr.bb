SUMMARY = "Epson ESC/P-R Inkjet Printer Driver"
DESCRIPTION = "The ESC/P-R driver works as a filter program \
used with CUPS. \
 \
It offers high quality printing with Seiko Epson \
color inkjet printers. \
 \
This driver can only be used with printers that \
support the Epson ESC/P-R language. \
 \
For a list of supported printers by a currently \
installed package see the PPD files in this directory: \
 \
/usr/share/cups/model/manufacturer-PPDs/epson-inkjet-printer-escpr"
LICENSE = "GPL-2.0-only"

PV = "1.7.22"

RPM_NAME = "epson-inkjet-printer-escpr-1.7.22-1.4.aarch64.rpm"
RPM_HASH = "a748c0516e968167ebdbac8c033820d8b9e435b1b8930b995fadfb282c540b7066969bb23f4c3c315bd56a7a0bc6e566eab9a871cb1175b47da14f53c6c57561"

RPROVIDES:${PN} += "epson-inkjet-printer-escpr \
libescpr.so.1 \
postscriptdriver-epson;artisan-1430; \
postscriptdriver-epson;artisan-630; \
postscriptdriver-epson;artisan-700; \
postscriptdriver-epson;artisan-710; \
postscriptdriver-epson;artisan-720; \
postscriptdriver-epson;artisan-730; \
postscriptdriver-epson;artisan-800; \
postscriptdriver-epson;artisan-810; \
postscriptdriver-epson;artisan-830; \
postscriptdriver-epson;artisan-837; \
postscriptdriver-epson;e-150; \
postscriptdriver-epson;e-200; \
postscriptdriver-epson;e-300; \
postscriptdriver-epson;e-330; \
postscriptdriver-epson;e-330s; \
postscriptdriver-epson;e-340; \
postscriptdriver-epson;e-350; \
postscriptdriver-epson;e-360-series; \
postscriptdriver-epson;e-370-series; \
postscriptdriver-epson;e-500; \
postscriptdriver-epson;e-520; \
postscriptdriver-epson;e-530; \
postscriptdriver-epson;e-600; \
postscriptdriver-epson;e-700; \
postscriptdriver-epson;e-720; \
postscriptdriver-epson;e-800; \
postscriptdriver-epson;e-810; \
postscriptdriver-epson;e-820; \
postscriptdriver-epson;e-830-series; \
postscriptdriver-epson;e-840-series; \
postscriptdriver-epson;e-850-series; \
postscriptdriver-epson;ec-c110-series; \
postscriptdriver-epson;ep-10va-series; \
postscriptdriver-epson;ep-306-series; \
postscriptdriver-epson;ep-30va-series; \
postscriptdriver-epson;ep-4004; \
postscriptdriver-epson;ep-702a; \
postscriptdriver-epson;ep-703a; \
postscriptdriver-epson;ep-704a; \
postscriptdriver-epson;ep-705a-series; \
postscriptdriver-epson;ep-706a-series; \
postscriptdriver-epson;ep-707a-series; \
postscriptdriver-epson;ep-708a-series; \
postscriptdriver-epson;ep-709a-series; \
postscriptdriver-epson;ep-710a-series; \
postscriptdriver-epson;ep-711a-series; \
postscriptdriver-epson;ep-712a-series; \
postscriptdriver-epson;ep-713a-series; \
postscriptdriver-epson;ep-714a-series; \
postscriptdriver-epson;ep-715a-series; \
postscriptdriver-epson;ep-774a; \
postscriptdriver-epson;ep-775a-series; \
postscriptdriver-epson;ep-776a-series; \
postscriptdriver-epson;ep-777a-series; \
postscriptdriver-epson;ep-801a; \
postscriptdriver-epson;ep-802a; \
postscriptdriver-epson;ep-803a; \
postscriptdriver-epson;ep-804a; \
postscriptdriver-epson;ep-805a-series; \
postscriptdriver-epson;ep-806a-series; \
postscriptdriver-epson;ep-807a-series; \
postscriptdriver-epson;ep-808a-series; \
postscriptdriver-epson;ep-810a-series; \
postscriptdriver-epson;ep-811a-series; \
postscriptdriver-epson;ep-812a-series; \
postscriptdriver-epson;ep-813a-series; \
postscriptdriver-epson;ep-814a-series; \
postscriptdriver-epson;ep-815a-series; \
postscriptdriver-epson;ep-901a; \
postscriptdriver-epson;ep-901f; \
postscriptdriver-epson;ep-902a; \
postscriptdriver-epson;ep-903a; \
postscriptdriver-epson;ep-903f; \
postscriptdriver-epson;ep-904a; \
postscriptdriver-epson;ep-904f; \
postscriptdriver-epson;ep-905a-series; \
postscriptdriver-epson;ep-905f-series; \
postscriptdriver-epson;ep-906f-series; \
postscriptdriver-epson;ep-907f-series; \
postscriptdriver-epson;ep-976a3-series; \
postscriptdriver-epson;ep-977a3-series; \
postscriptdriver-epson;ep-978a3-series; \
postscriptdriver-epson;ep-979a3-series; \
postscriptdriver-epson;ep-m552t-series; \
postscriptdriver-epson;ep-m553t-series; \
postscriptdriver-epson;ep-m570t-series; \
postscriptdriver-epson;epson-stylus-photo-1430; \
postscriptdriver-epson;epson-stylus-photo-1500; \
postscriptdriver-epson;epson-stylus-photo-px730; \
postscriptdriver-epson;epson-stylus-photo-px830; \
postscriptdriver-epson;epson-stylus-photo-tx730; \
postscriptdriver-epson;et-1110-series; \
postscriptdriver-epson;et-16500-series; \
postscriptdriver-epson;et-1810-series; \
postscriptdriver-epson;et-2400-series; \
postscriptdriver-epson;et-2500-series; \
postscriptdriver-epson;et-2550-series; \
postscriptdriver-epson;et-2600-series; \
postscriptdriver-epson;et-2610-series; \
postscriptdriver-epson;et-2650-series; \
postscriptdriver-epson;et-2700-series; \
postscriptdriver-epson;et-2710-series; \
postscriptdriver-epson;et-2720-series; \
postscriptdriver-epson;et-2750-series; \
postscriptdriver-epson;et-2760-series; \
postscriptdriver-epson;et-2800-series; \
postscriptdriver-epson;et-2810-series; \
postscriptdriver-epson;et-2820-series; \
postscriptdriver-epson;et-2850-series; \
postscriptdriver-epson;et-4500-series; \
postscriptdriver-epson;et-4550-series; \
postscriptdriver-epson;et-4700-series; \
postscriptdriver-epson;et-4800-series; \
postscriptdriver-epson;et-7700-series; \
postscriptdriver-epson;et-7750-series; \
postscriptdriver-epson;et-m1100-series; \
postscriptdriver-epson;et-m1120-series; \
postscriptdriver-epson;et-m2120-series; \
postscriptdriver-epson;ew-052a-series; \
postscriptdriver-epson;ew-m5071ft-series; \
postscriptdriver-epson;ew-m571t-series; \
postscriptdriver-epson;ew-m660ft-series; \
postscriptdriver-epson;ew-m770t-series; \
postscriptdriver-epson;ew-m970a3t-series; \
postscriptdriver-epson;k200; \
postscriptdriver-epson;k300; \
postscriptdriver-epson;l1110-series; \
postscriptdriver-epson;l1455-series; \
postscriptdriver-epson;l3050-series; \
postscriptdriver-epson;l3060-series; \
postscriptdriver-epson;l3070-series; \
postscriptdriver-epson;l3100-series; \
postscriptdriver-epson;l3110-series; \
postscriptdriver-epson;l3150-series; \
postscriptdriver-epson;l3160-series; \
postscriptdriver-epson;l3250-series; \
postscriptdriver-epson;l3260-series; \
postscriptdriver-epson;l364-series; \
postscriptdriver-epson;l375-series; \
postscriptdriver-epson;l385-series; \
postscriptdriver-epson;l386-series; \
postscriptdriver-epson;l395-series; \
postscriptdriver-epson;l396-series; \
postscriptdriver-epson;l405-series; \
postscriptdriver-epson;l4150-series; \
postscriptdriver-epson;l4160-series; \
postscriptdriver-epson;l4260-series; \
postscriptdriver-epson;l455-series; \
postscriptdriver-epson;l475-series; \
postscriptdriver-epson;l485-series; \
postscriptdriver-epson;l486-series; \
postscriptdriver-epson;l495-series; \
postscriptdriver-epson;l5190-series; \
postscriptdriver-epson;l5290-series; \
postscriptdriver-epson;l565-series; \
postscriptdriver-epson;l575-series; \
postscriptdriver-epson;l605-series; \
postscriptdriver-epson;l655-series; \
postscriptdriver-epson;l7160-series; \
postscriptdriver-epson;l7180-series; \
postscriptdriver-epson;l805-series; \
postscriptdriver-epson;l810-series; \
postscriptdriver-epson;l850-series; \
postscriptdriver-epson;m1100-series; \
postscriptdriver-epson;m1120-series; \
postscriptdriver-epson;m200-series; \
postscriptdriver-epson;m205-series; \
postscriptdriver-epson;m2110-series; \
postscriptdriver-epson;m2120-series; \
postscriptdriver-epson;me-200; \
postscriptdriver-epson;me-301-series; \
postscriptdriver-epson;me-303-series; \
postscriptdriver-epson;me-400-series; \
postscriptdriver-epson;me-office-510; \
postscriptdriver-epson;me-office-520; \
postscriptdriver-epson;me-office-530; \
postscriptdriver-epson;me-office-560w; \
postscriptdriver-epson;me-office-570; \
postscriptdriver-epson;me-office-600f; \
postscriptdriver-epson;me-office-620f; \
postscriptdriver-epson;me-office-650fn; \
postscriptdriver-epson;me-office-700fw; \
postscriptdriver-epson;me-office-900wd; \
postscriptdriver-epson;me-office-940fw; \
postscriptdriver-epson;me-office-960fwd; \
postscriptdriver-epson;nx230-tx230; \
postscriptdriver-epson;nx430-tx435; \
postscriptdriver-epson;pf-70-series; \
postscriptdriver-epson;pf-71-series; \
postscriptdriver-epson;pf-81-series; \
postscriptdriver-epson;picturemate-500; \
postscriptdriver-epson;picturemate-deluxe; \
postscriptdriver-epson;picturemate-express; \
postscriptdriver-epson;picturemate-pm-200; \
postscriptdriver-epson;picturemate-pm-210; \
postscriptdriver-epson;picturemate-pm-215; \
postscriptdriver-epson;picturemate-pm-225; \
postscriptdriver-epson;picturemate-pm-235; \
postscriptdriver-epson;picturemate-pm-240; \
postscriptdriver-epson;picturemate-pm-245; \
postscriptdriver-epson;picturemate-pm-250; \
postscriptdriver-epson;picturemate-pm-260; \
postscriptdriver-epson;picturemate-pm-270; \
postscriptdriver-epson;picturemate-pm-280; \
postscriptdriver-epson;picturemate-pm-290; \
postscriptdriver-epson;picturemate-pm-300; \
postscriptdriver-epson;picturemate-pm-310; \
postscriptdriver-epson;pm-400-series; \
postscriptdriver-epson;pm-a750; \
postscriptdriver-epson;pm-a820; \
postscriptdriver-epson;pm-a840; \
postscriptdriver-epson;pm-a840s; \
postscriptdriver-epson;pm-a890; \
postscriptdriver-epson;pm-a920; \
postscriptdriver-epson;pm-a940; \
postscriptdriver-epson;pm-a950; \
postscriptdriver-epson;pm-a970; \
postscriptdriver-epson;pm-d600; \
postscriptdriver-epson;pm-d800; \
postscriptdriver-epson;pm-d870; \
postscriptdriver-epson;pm-g4500; \
postscriptdriver-epson;pm-g850; \
postscriptdriver-epson;pm-t960; \
postscriptdriver-epson;pm-t990; \
postscriptdriver-epson;px-046a-series; \
postscriptdriver-epson;px-047a-series; \
postscriptdriver-epson;px-048a-series; \
postscriptdriver-epson;px-049a-series; \
postscriptdriver-epson;px-1600f; \
postscriptdriver-epson;px-1700f; \
postscriptdriver-epson;px-205-series; \
postscriptdriver-epson;px-404a; \
postscriptdriver-epson;px-405a-series; \
postscriptdriver-epson;px-434a; \
postscriptdriver-epson;px-435a-series; \
postscriptdriver-epson;px-436a-series; \
postscriptdriver-epson;px-437a-series; \
postscriptdriver-epson;px-501a; \
postscriptdriver-epson;px-502a; \
postscriptdriver-epson;px-503a; \
postscriptdriver-epson;px-504a; \
postscriptdriver-epson;px-505f-series; \
postscriptdriver-epson;px-535f-series; \
postscriptdriver-epson;px-5600; \
postscriptdriver-epson;px-5v; \
postscriptdriver-epson;px-601f; \
postscriptdriver-epson;px-602f; \
postscriptdriver-epson;px-603f; \
postscriptdriver-epson;px-605f-series; \
postscriptdriver-epson;px-673f; \
postscriptdriver-epson;px-675f-series; \
postscriptdriver-epson;px-7v; \
postscriptdriver-epson;px-a620; \
postscriptdriver-epson;px-a640; \
postscriptdriver-epson;px-a650; \
postscriptdriver-epson;px-a720; \
postscriptdriver-epson;px-a740; \
postscriptdriver-epson;px-b700; \
postscriptdriver-epson;px-b750f; \
postscriptdriver-epson;px-fa700; \
postscriptdriver-epson;px-g5300; \
postscriptdriver-epson;px-m160t-series; \
postscriptdriver-epson;px-m350f; \
postscriptdriver-epson;px-m5040f; \
postscriptdriver-epson;px-m5041f; \
postscriptdriver-epson;px-m650a; \
postscriptdriver-epson;px-m650f; \
postscriptdriver-epson;px-m7050-series; \
postscriptdriver-epson;px-m7050fp; \
postscriptdriver-epson;px-m7050fx; \
postscriptdriver-epson;px-m740f; \
postscriptdriver-epson;px-m741f; \
postscriptdriver-epson;px-m840f; \
postscriptdriver-epson;px-m840fx; \
postscriptdriver-epson;px-m860f; \
postscriptdriver-epson;px-s05-series; \
postscriptdriver-epson;px-s06-series; \
postscriptdriver-epson;px-s160t-series; \
postscriptdriver-epson;px-s170t-series; \
postscriptdriver-epson;px-s170ut-series; \
postscriptdriver-epson;px-s350; \
postscriptdriver-epson;px-s5040; \
postscriptdriver-epson;px-s7050-series; \
postscriptdriver-epson;px-s7050ps; \
postscriptdriver-epson;px-s7050x; \
postscriptdriver-epson;px-s740; \
postscriptdriver-epson;px-s840; \
postscriptdriver-epson;px-s840x; \
postscriptdriver-epson;px-s860; \
postscriptdriver-epson;st-2000-series; \
postscriptdriver-epson;st-c2100-series; \
postscriptdriver-epson;stylus-cx2800; \
postscriptdriver-epson;stylus-cx2900; \
postscriptdriver-epson;stylus-cx3700; \
postscriptdriver-epson;stylus-cx3800; \
postscriptdriver-epson;stylus-cx3900; \
postscriptdriver-epson;stylus-cx4200; \
postscriptdriver-epson;stylus-cx4800; \
postscriptdriver-epson;stylus-cx4900; \
postscriptdriver-epson;stylus-cx5000; \
postscriptdriver-epson;stylus-cx5900; \
postscriptdriver-epson;stylus-cx6000; \
postscriptdriver-epson;stylus-cx7300; \
postscriptdriver-epson;stylus-cx7400; \
postscriptdriver-epson;stylus-cx7700; \
postscriptdriver-epson;stylus-cx7800; \
postscriptdriver-epson;stylus-cx8300; \
postscriptdriver-epson;stylus-cx8400; \
postscriptdriver-epson;stylus-cx9300f; \
postscriptdriver-epson;stylus-cx9400fax; \
postscriptdriver-epson;stylus-dx3800; \
postscriptdriver-epson;stylus-dx4000; \
postscriptdriver-epson;stylus-dx4200; \
postscriptdriver-epson;stylus-dx4800; \
postscriptdriver-epson;stylus-dx5000; \
postscriptdriver-epson;stylus-dx7400; \
postscriptdriver-epson;stylus-dx8400; \
postscriptdriver-epson;stylus-dx9400f; \
postscriptdriver-epson;stylus-nx200; \
postscriptdriver-epson;stylus-nx210; \
postscriptdriver-epson;stylus-nx230; \
postscriptdriver-epson;stylus-nx300; \
postscriptdriver-epson;stylus-nx330; \
postscriptdriver-epson;stylus-nx400; \
postscriptdriver-epson;stylus-nx410; \
postscriptdriver-epson;stylus-nx420; \
postscriptdriver-epson;stylus-nx430; \
postscriptdriver-epson;stylus-nx510; \
postscriptdriver-epson;stylus-nx530; \
postscriptdriver-epson;stylus-nx620; \
postscriptdriver-epson;stylus-nx635; \
postscriptdriver-epson;stylus-office-bx300f; \
postscriptdriver-epson;stylus-office-bx305-plus; \
postscriptdriver-epson;stylus-office-bx305; \
postscriptdriver-epson;stylus-office-bx310fn; \
postscriptdriver-epson;stylus-office-bx320fw; \
postscriptdriver-epson;stylus-office-bx525wd; \
postscriptdriver-epson;stylus-office-bx535wd; \
postscriptdriver-epson;stylus-office-bx600fw; \
postscriptdriver-epson;stylus-office-bx610fw; \
postscriptdriver-epson;stylus-office-bx620fwd; \
postscriptdriver-epson;stylus-office-bx630fw; \
postscriptdriver-epson;stylus-office-bx635fwd; \
postscriptdriver-epson;stylus-office-bx925; \
postscriptdriver-epson;stylus-office-bx935; \
postscriptdriver-epson;stylus-office-tx300f; \
postscriptdriver-epson;stylus-office-tx320f; \
postscriptdriver-epson;stylus-office-tx510fn; \
postscriptdriver-epson;stylus-office-tx515fn; \
postscriptdriver-epson;stylus-office-tx525fw; \
postscriptdriver-epson;stylus-office-tx600fw; \
postscriptdriver-epson;stylus-office-tx610fw; \
postscriptdriver-epson;stylus-office-tx620fwd; \
postscriptdriver-epson;stylus-photo-1400; \
postscriptdriver-epson;stylus-photo-1410; \
postscriptdriver-epson;stylus-photo-px650; \
postscriptdriver-epson;stylus-photo-px660; \
postscriptdriver-epson;stylus-photo-px700w; \
postscriptdriver-epson;stylus-photo-px710w; \
postscriptdriver-epson;stylus-photo-px720wd; \
postscriptdriver-epson;stylus-photo-px800fw; \
postscriptdriver-epson;stylus-photo-px810fw; \
postscriptdriver-epson;stylus-photo-px820fwd; \
postscriptdriver-epson;stylus-photo-r1900; \
postscriptdriver-epson;stylus-photo-r2000; \
postscriptdriver-epson;stylus-photo-r240; \
postscriptdriver-epson;stylus-photo-r250; \
postscriptdriver-epson;stylus-photo-r260; \
postscriptdriver-epson;stylus-photo-r265; \
postscriptdriver-epson;stylus-photo-r270; \
postscriptdriver-epson;stylus-photo-r2880; \
postscriptdriver-epson;stylus-photo-r3000; \
postscriptdriver-epson;stylus-photo-r340; \
postscriptdriver-epson;stylus-photo-r350; \
postscriptdriver-epson;stylus-photo-r360; \
postscriptdriver-epson;stylus-photo-r380; \
postscriptdriver-epson;stylus-photo-r390; \
postscriptdriver-epson;stylus-photo-rx520; \
postscriptdriver-epson;stylus-photo-rx530; \
postscriptdriver-epson;stylus-photo-rx560; \
postscriptdriver-epson;stylus-photo-rx580; \
postscriptdriver-epson;stylus-photo-rx585; \
postscriptdriver-epson;stylus-photo-rx590; \
postscriptdriver-epson;stylus-photo-rx595; \
postscriptdriver-epson;stylus-photo-rx610; \
postscriptdriver-epson;stylus-photo-rx640; \
postscriptdriver-epson;stylus-photo-rx650; \
postscriptdriver-epson;stylus-photo-rx680; \
postscriptdriver-epson;stylus-photo-rx685; \
postscriptdriver-epson;stylus-photo-rx690; \
postscriptdriver-epson;stylus-photo-tx650; \
postscriptdriver-epson;stylus-photo-tx700w; \
postscriptdriver-epson;stylus-photo-tx710w; \
postscriptdriver-epson;stylus-photo-tx720wd; \
postscriptdriver-epson;stylus-photo-tx800fw; \
postscriptdriver-epson;stylus-photo-tx810fw; \
postscriptdriver-epson;stylus-sx200; \
postscriptdriver-epson;stylus-sx210; \
postscriptdriver-epson;stylus-sx218; \
postscriptdriver-epson;stylus-sx230; \
postscriptdriver-epson;stylus-sx235; \
postscriptdriver-epson;stylus-sx400; \
postscriptdriver-epson;stylus-sx410; \
postscriptdriver-epson;stylus-sx420w; \
postscriptdriver-epson;stylus-sx430; \
postscriptdriver-epson;stylus-sx440; \
postscriptdriver-epson;stylus-sx510w; \
postscriptdriver-epson;stylus-sx525wd; \
postscriptdriver-epson;stylus-sx535wd; \
postscriptdriver-epson;stylus-sx600fw; \
postscriptdriver-epson;stylus-sx610fw; \
postscriptdriver-epson;stylus-sx620fw; \
postscriptdriver-epson;stylus-tx200; \
postscriptdriver-epson;stylus-tx210; \
postscriptdriver-epson;stylus-tx220; \
postscriptdriver-epson;stylus-tx230; \
postscriptdriver-epson;stylus-tx235; \
postscriptdriver-epson;stylus-tx400; \
postscriptdriver-epson;stylus-tx410; \
postscriptdriver-epson;stylus-tx420w; \
postscriptdriver-epson;stylus-tx430; \
postscriptdriver-epson;stylus-tx550w; \
postscriptdriver-epson;stylus-tx560wd; \
postscriptdriver-epson;tx220-nx220; \
postscriptdriver-epson;tx320-workforce320; \
postscriptdriver-epson;tx420-nx420; \
postscriptdriver-epson;tx720-artisan720; \
postscriptdriver-epson;tx820-artisan830; \
postscriptdriver-epson;wf-100-series; \
postscriptdriver-epson;wf-110-series; \
postscriptdriver-epson;wf-2510-series; \
postscriptdriver-epson;wf-2520-series; \
postscriptdriver-epson;wf-2530-series; \
postscriptdriver-epson;wf-2540-series; \
postscriptdriver-epson;wf-2630-series; \
postscriptdriver-epson;wf-2650-series; \
postscriptdriver-epson;wf-2660-series; \
postscriptdriver-epson;wf-2750-series; \
postscriptdriver-epson;wf-2760-series; \
postscriptdriver-epson;wf-2810-series; \
postscriptdriver-epson;wf-2820-series; \
postscriptdriver-epson;wf-2830-series; \
postscriptdriver-epson;wf-2840-series; \
postscriptdriver-epson;wf-2850-series; \
postscriptdriver-epson;wf-2870-series; \
postscriptdriver-epson;wf-2910-series; \
postscriptdriver-epson;wf-2930-series; \
postscriptdriver-epson;wf-2950-series; \
postscriptdriver-epson;wf-3010-series; \
postscriptdriver-epson;wf-3520-series; \
postscriptdriver-epson;wf-3530-series; \
postscriptdriver-epson;wf-3540-series; \
postscriptdriver-epson;wf-3620-series; \
postscriptdriver-epson;wf-3640-series; \
postscriptdriver-epson;wf-4630-series; \
postscriptdriver-epson;wf-4640-series; \
postscriptdriver-epson;wf-5110-series; \
postscriptdriver-epson;wf-5190-series; \
postscriptdriver-epson;wf-5620-series; \
postscriptdriver-epson;wf-5690-series; \
postscriptdriver-epson;wf-6090-series; \
postscriptdriver-epson;wf-6530-series; \
postscriptdriver-epson;wf-6590-series; \
postscriptdriver-epson;wf-7110-series; \
postscriptdriver-epson;wf-7510-series; \
postscriptdriver-epson;wf-7511-series; \
postscriptdriver-epson;wf-7515-series; \
postscriptdriver-epson;wf-7520-series; \
postscriptdriver-epson;wf-7521-series; \
postscriptdriver-epson;wf-7525-series; \
postscriptdriver-epson;wf-7610-series; \
postscriptdriver-epson;wf-7620-series; \
postscriptdriver-epson;wf-8010-series; \
postscriptdriver-epson;wf-8090-series; \
postscriptdriver-epson;wf-8510-series; \
postscriptdriver-epson;wf-8590-series; \
postscriptdriver-epson;wf-m1560-series; \
postscriptdriver-epson;wf-m5190-series; \
postscriptdriver-epson;wf-m5690-series; \
postscriptdriver-epson;wf-r4640-series; \
postscriptdriver-epson;wf-r5190-series; \
postscriptdriver-epson;wf-r5690-series; \
postscriptdriver-epson;wf-r8590-series; \
postscriptdriver-epson;workforce-310; \
postscriptdriver-epson;workforce-320; \
postscriptdriver-epson;workforce-435; \
postscriptdriver-epson;workforce-500; \
postscriptdriver-epson;workforce-520; \
postscriptdriver-epson;workforce-545; \
postscriptdriver-epson;workforce-600; \
postscriptdriver-epson;workforce-610; \
postscriptdriver-epson;workforce-620; \
postscriptdriver-epson;workforce-630; \
postscriptdriver-epson;workforce-645; \
postscriptdriver-epson;workforce-840; \
postscriptdriver-epson;workforce-845; \
postscriptdriver-epson;wp-4010-series; \
postscriptdriver-epson;wp-4011-series; \
postscriptdriver-epson;wp-4015-series; \
postscriptdriver-epson;wp-4020-series; \
postscriptdriver-epson;wp-4022-series; \
postscriptdriver-epson;wp-4023-series; \
postscriptdriver-epson;wp-4025-series; \
postscriptdriver-epson;wp-4090-series; \
postscriptdriver-epson;wp-4091-series; \
postscriptdriver-epson;wp-4092-series; \
postscriptdriver-epson;wp-4095-series; \
postscriptdriver-epson;wp-4511-series; \
postscriptdriver-epson;wp-4515-series; \
postscriptdriver-epson;wp-4520-series; \
postscriptdriver-epson;wp-4521-series; \
postscriptdriver-epson;wp-4525-series; \
postscriptdriver-epson;wp-4530-series; \
postscriptdriver-epson;wp-4531-series; \
postscriptdriver-epson;wp-4532-series; \
postscriptdriver-epson;wp-4533-series; \
postscriptdriver-epson;wp-4535-series; \
postscriptdriver-epson;wp-4540-series; \
postscriptdriver-epson;wp-4545-series; \
postscriptdriver-epson;wp-4590-series; \
postscriptdriver-epson;wp-4592-series; \
postscriptdriver-epson;wp-4595-series; \
postscriptdriver-epson;wp-m4011-series; \
postscriptdriver-epson;wp-m4015-series; \
postscriptdriver-epson;wp-m4095-series; \
postscriptdriver-epson;wp-m4521-series; \
postscriptdriver-epson;wp-m4525-series; \
postscriptdriver-epson;wp-m4595-series; \
postscriptdriver-epson;xp-200-series; \
postscriptdriver-epson;xp-201-204-208-series; \
postscriptdriver-epson;xp-202-203-206-series; \
postscriptdriver-epson;xp-205-207-series; \
postscriptdriver-epson;xp-2100-series; \
postscriptdriver-epson;xp-211-214-216-series; \
postscriptdriver-epson;xp-212-213-series; \
postscriptdriver-epson;xp-215-217-series; \
postscriptdriver-epson;xp-2150-series; \
postscriptdriver-epson;xp-220-series; \
postscriptdriver-epson;xp-2200-series; \
postscriptdriver-epson;xp-225-series; \
postscriptdriver-epson;xp-235-series; \
postscriptdriver-epson;xp-240-series; \
postscriptdriver-epson;xp-243-245-247-series; \
postscriptdriver-epson;xp-255-257-series; \
postscriptdriver-epson;xp-300-series; \
postscriptdriver-epson;xp-302-303-305-306-series; \
postscriptdriver-epson;xp-310-series; \
postscriptdriver-epson;xp-3100-series; \
postscriptdriver-epson;xp-312-313-315-series; \
postscriptdriver-epson;xp-3150-series; \
postscriptdriver-epson;xp-320-series; \
postscriptdriver-epson;xp-3200-series; \
postscriptdriver-epson;xp-322-323-325-series; \
postscriptdriver-epson;xp-330-series; \
postscriptdriver-epson;xp-332-335-series; \
postscriptdriver-epson;xp-340-series; \
postscriptdriver-epson;xp-342-343-345-series; \
postscriptdriver-epson;xp-352-355-series; \
postscriptdriver-epson;xp-400-series; \
postscriptdriver-epson;xp-402-403-405-406-series; \
postscriptdriver-epson;xp-410-series; \
postscriptdriver-epson;xp-4100-series; \
postscriptdriver-epson;xp-412-413-415-series; \
postscriptdriver-epson;xp-4150-series; \
postscriptdriver-epson;xp-420-series; \
postscriptdriver-epson;xp-4200-series; \
postscriptdriver-epson;xp-422-423-425-series; \
postscriptdriver-epson;xp-430-series; \
postscriptdriver-epson;xp-432-435-series; \
postscriptdriver-epson;xp-440-series; \
postscriptdriver-epson;xp-442-445-series; \
postscriptdriver-epson;xp-452-455-series; \
postscriptdriver-epson;xp-510-series; \
postscriptdriver-epson;xp-520-series; \
postscriptdriver-epson;xp-530-series; \
postscriptdriver-epson;xp-540-series; \
postscriptdriver-epson;xp-55-series; \
postscriptdriver-epson;xp-600-series; \
postscriptdriver-epson;xp-610-series; \
postscriptdriver-epson;xp-620-series; \
postscriptdriver-epson;xp-630-series; \
postscriptdriver-epson;xp-640-series; \
postscriptdriver-epson;xp-700-series; \
postscriptdriver-epson;xp-710-series; \
postscriptdriver-epson;xp-7100-series; \
postscriptdriver-epson;xp-720-series; \
postscriptdriver-epson;xp-750-series; \
postscriptdriver-epson;xp-760-series; \
postscriptdriver-epson;xp-800-series; \
postscriptdriver-epson;xp-810-series; \
postscriptdriver-epson;xp-820-series; \
postscriptdriver-epson;xp-830-series; \
postscriptdriver-epson;xp-850-series; \
postscriptdriver-epson;xp-860-series; \
postscriptdriver-epson;xp-900-series; \
postscriptdriver-epson;xp-950-series; \
postscriptdriver-epson;xp-960-series;"

RDEPENDS:${PN} += "/sbin/ldconfig \
cups \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libcupsimage.so.2"

inherit rpm
