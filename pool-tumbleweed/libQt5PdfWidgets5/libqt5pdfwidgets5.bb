SUMMARY = "Qt5 PDF library for Qt Widgets"
DESCRIPTION = "Library of the Qt PDF module with support for Qt Widgets."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libQt5PdfWidgets5-5.15.14-2.1.aarch64.rpm"
RPM_HASH = "78d98b106426706550975901344185f068af99e1235c43ae77552587e4abe1684627813ceec1a1733772dc1dfb0e6baadd41cabc28d582bc9c311ac264e35550"

RPROVIDES:${PN} += "libQt5PdfWidgets.so.5 \
libQt5PdfWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Pdf.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
