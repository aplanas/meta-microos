SUMMARY = "Qt5 PDF library"
DESCRIPTION = "Main library of the Qt PDF module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.15"

RPM_NAME = "libQt5Pdf5-5.15.15-1.1.aarch64.rpm"
RPM_HASH = "f69f07aee9a9de434644d1259b821bbff5000a19ce419e512bef960388c201c5a16e634a607db3cceff30b91207fa1a9d85c570e085e3341b9b4e8b26cde5d16"

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
