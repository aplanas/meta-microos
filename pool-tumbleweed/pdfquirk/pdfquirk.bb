SUMMARY = "App to create PDFs from images or scans"
DESCRIPTION = "PDF Quirk helps to generate PDF files from images from storage \
or directly from the scanner."
LICENSE = "GPL-3.0-only"

PV = "0.95"

RPM_NAME = "pdfquirk-0.95-1.6.aarch64.rpm"
RPM_HASH = "f73117cb31bf68e338fbf7cd984aa74de19bd727845c31121487b65581acb185ff126ebcabd976e2c302dd3751ea60550c1510c2416b36e510a397023b45dc43"

RPROVIDES:${PN} += "application() \
application(de.volle-kraft-voraus.pdfquirk.desktop) \
metainfo() \
metainfo(de.volle-kraft-voraus.pdfquirk.appdata.xml) \
pdfquirk \
pdfquirk(aarch-64)"

RDEPENDS:${PN} += "ImageMagick \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
