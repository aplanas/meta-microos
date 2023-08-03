SUMMARY = "Qt5 PDF library"
DESCRIPTION = "Main library of the Qt PDF module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libQt5Pdf5-5.15.14-2.1.aarch64.rpm"
RPM_HASH = "ea9a5386e716ac4a461089eeb2a8dec3def2a68b87f42a6e4d191c27ff577dd54306a1ed3e11fbb886d2d720bd3c0d3c9bc4201b9863284d536935925807a46d"

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
