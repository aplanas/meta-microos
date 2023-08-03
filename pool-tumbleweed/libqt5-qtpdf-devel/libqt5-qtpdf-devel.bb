SUMMARY = "Development files for the Qt5 PDF library"
DESCRIPTION = "You need this package if you want to compile programs with Qt PDF."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtpdf-devel-5.15.14-2.1.aarch64.rpm"
RPM_HASH = "599ea7ddb8b47892eb5516204b442ad1bda1e31515ea5b9542319a0f55122cab4f8b08775b73399bbb77e6a9afeab4b568ba75aade25a042648a91c585b7b1a6"

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
