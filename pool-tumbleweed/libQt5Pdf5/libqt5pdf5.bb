SUMMARY = "Qt5 PDF library"
DESCRIPTION = "Main library of the Qt PDF module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libQt5Pdf5-5.15.14-1.1.aarch64.rpm"
RPM_HASH = "9589724b69e2d0638ed4fc957d33bc7073172fdb83b4374a7fb98b452ab047ee5ce556b017ac2b79c6d36ef88f339aae1daa05bab4e5d13061d7e07a2f528338"

RPROVIDES:${PN} += "libQt5Pdf.so.5 \
libQt5Pdf5 \
libqpdf.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libfreetype.so.6 \
libjpeg.so.8 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
