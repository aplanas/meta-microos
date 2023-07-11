SUMMARY = "Development files for the Qt5 PDF library"
DESCRIPTION = "You need this package if you want to compile programs with Qt PDF."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtpdf-devel-5.15.14-1.3.aarch64.rpm"
RPM_HASH = "fa909d92ab172d0cb530ce5642d2a4342b6e5b1063c7716238404b12a9ac12a5c32f456cbdfdcc6a87c5e4bf5f7d1b2c5a8fd5de1a702db58be23468b3201508"

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
