SUMMARY = "Development files for the Qt5 PDF library"
DESCRIPTION = "You need this package if you want to compile programs with Qt PDF."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.15"

RPM_NAME = "libqt5-qtpdf-devel-5.15.15-1.1.aarch64.rpm"
RPM_HASH = "b626fded720096f0ebc32491785903e1aacf0fa8c16dbe9df6294fb0ecc8aa7c035ef782cb5edc101ace1a182174e3664ba9df65e21f167e0e29f3e0f6e90254"

RPROVIDES:${PN} += "cmake-Qt5Pdf \
cmake-Qt5PdfWidgets \
libqt5-qtpdf-devel \
pkgconfig-Qt5Pdf \
pkgconfig-Qt5PdfWidgets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Pdf5 \
libQt5PdfWidgets5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Pdf \
pkgconfig-Qt5Widgets"

inherit rpm
