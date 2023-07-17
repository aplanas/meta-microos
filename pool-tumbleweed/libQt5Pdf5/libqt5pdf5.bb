SUMMARY = "Qt5 PDF library"
DESCRIPTION = "Main library of the Qt PDF module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libQt5Pdf5-5.15.14-1.4.aarch64.rpm"
RPM_HASH = "38fdd5dfcec33b65726b6b9148aed486cbfdf48604a2943023eb7447bce73b629fe5e8cbf770f57c8bfb95a48dbfb4d112e89bc84da4bff8d6b232f83cf7cee9"

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
