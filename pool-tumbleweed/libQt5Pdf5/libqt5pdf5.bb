SUMMARY = "Qt5 PDF library"
DESCRIPTION = "Main library of the Qt PDF module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libQt5Pdf5-5.15.14-1.3.aarch64.rpm"
RPM_HASH = "4af8b1a03f0db05e996b45d5358b2e99fa1a82aa9b02ae1846d616faef0827f3b69df6fe7a695244465d648101e1958c38b7d0c865a15c583481e5c7d2f371b8"

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
