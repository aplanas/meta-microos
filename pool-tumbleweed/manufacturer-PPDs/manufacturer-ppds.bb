SUMMARY = "PPD Files from Printer Manufacturers"
DESCRIPTION = "PPD files from printer manufacturers that are under a free license. \
 \
For example, the original MIT license, shown for example under \
http://www.opensource.org/licenses/mit-license.php, is okay but not an \
often used modified MIT license, which does not allow redistribution if \
the file was altered in any way from its original form. \
 \
If you have a PostScript printer and there is no PPD file included in \
this package, ask your printer manufacturer for a PPD file or visit \
http://www.linuxprinting.org/ppd-doc.html."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "10.2"

RPM_NAME = "manufacturer-PPDs-10.2-277.2.noarch.rpm"
RPM_HASH = "98fe24f2017997a2fce0c616a0836eb2ab17f604ec0bedb6a37d82f51c10f4480e64295789ecd2d4d8ce9d98543084135def2a2edb19dc505fed7750814e2f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "manufacturer-PPDs \
postscriptdriver-hp;hp2250; \
postscriptdriver-hp;hp2280; \
postscriptdriver-hp;hp2300; \
postscriptdriver-hp;hp2600; \
postscriptdriver-hp;hp3000; \
postscriptdriver-hp;hp9100; \
postscriptdriver-kyocera-mita;km-1510; \
postscriptdriver-kyocera-mita;km-1530; \
postscriptdriver-kyocera-mita;km-1810; \
postscriptdriver-kyocera-mita;km-2030; \
postscriptdriver-kyocera-mita;km-4230/5230; \
postscriptdriver-kyocera-mita;km-6230; \
postscriptdriver-kyocera-mita;km-c2630; \
postscriptdriver-kyocera-mita;km-c830; \
postscriptdriver-kyocera-mita;km-c850; \
postscriptdriver-kyocera-mita;kyocera-mita-ci-1100; \
postscriptdriver-kyocera-mita;kyocera-mita-cs-1815; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-1000+; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-1010; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-1018mfp; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-1020d; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-1050; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-1800+; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-1800; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-1900; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-1920; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-3800; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-3820n; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-3830n; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-6020; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-6026; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-6750; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-8000c; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-9100dn; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-9500dn; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-c5016n; \
postscriptdriver-kyocera-mita;kyocera-mita-fs-c8008n; \
postscriptdriver-kyocera-mita;kyocera-mita-km-1815; \
postscriptdriver-kyocera;cs-1815; \
postscriptdriver-kyocera;fs-8000c; \
postscriptdriver-kyocera;fs-9100dn; \
postscriptdriver-kyocera;fs-9500dn; \
postscriptdriver-kyocera;fs-c5016n; \
postscriptdriver-kyocera;fs-c8008n; \
postscriptdriver-kyocera;km-1815; \
postscriptdriver-kyocera;kyocera-fs-1000; \
postscriptdriver-kyocera;kyocera-fs-1030d; \
postscriptdriver-kyocera;kyocera-fs-1200; \
postscriptdriver-kyocera;kyocera-fs-1700+; \
postscriptdriver-kyocera;kyocera-fs-1700; \
postscriptdriver-kyocera;kyocera-fs-1714m; \
postscriptdriver-kyocera;kyocera-fs-1750; \
postscriptdriver-kyocera;kyocera-fs-2000d; \
postscriptdriver-kyocera;kyocera-fs-3700+; \
postscriptdriver-kyocera;kyocera-fs-3700; \
postscriptdriver-kyocera;kyocera-fs-3718m; \
postscriptdriver-kyocera;kyocera-fs-3750; \
postscriptdriver-kyocera;kyocera-fs-3900dn; \
postscriptdriver-kyocera;kyocera-fs-4000dn; \
postscriptdriver-kyocera;kyocera-fs-5800c; \
postscriptdriver-kyocera;kyocera-fs-5900c; \
postscriptdriver-kyocera;kyocera-fs-600; \
postscriptdriver-kyocera;kyocera-fs-6300; \
postscriptdriver-kyocera;kyocera-fs-6500+; \
postscriptdriver-kyocera;kyocera-fs-6700; \
postscriptdriver-kyocera;kyocera-fs-680; \
postscriptdriver-kyocera;kyocera-fs-6900; \
postscriptdriver-kyocera;kyocera-fs-6950dn; \
postscriptdriver-kyocera;kyocera-fs-7000+; \
postscriptdriver-kyocera;kyocera-fs-7000; \
postscriptdriver-kyocera;kyocera-fs-7028m; \
postscriptdriver-kyocera;kyocera-fs-800; \
postscriptdriver-kyocera;kyocera-fs-9000; \
postscriptdriver-kyocera;kyocera-fs-9130dn; \
postscriptdriver-kyocera;kyocera-fs-920; \
postscriptdriver-kyocera;kyocera-fs-9530dn; \
postscriptdriver-kyocera;kyocera-fs-c5020n; \
postscriptdriver-kyocera;kyocera-fs-c5030n; \
postscriptdriver-kyocera;kyocera-km-6030; \
postscriptdriver-kyocera;kyocera-km-8030; \
postscriptdriver-kyocera;kyocera-km-c2520; \
postscriptdriver-kyocera;kyocera-km-c3225; \
postscriptdriver-kyocera;kyocera-km-c3232; \
postscriptdriver-oki-data-corp;microline905psiii+f; \
postscriptdriver-oki-data-corp;ml703n3;"

RDEPENDS:${PN} += ""

inherit rpm
