SUMMARY = "Development files for the Qt5 PDF library"
DESCRIPTION = "You need this package if you want to compile programs with Qt PDF."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtpdf-devel-5.15.14-1.4.aarch64.rpm"
RPM_HASH = "660ddd1faa36775a66a8b2fb7428df9ec12762519b82916f3695c0748c5a79e13e9509bd13bf280268f595eea483c1f0279c90195a6e0cc2b6a3b14b0488e833"

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
