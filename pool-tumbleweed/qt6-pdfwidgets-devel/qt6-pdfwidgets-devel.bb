SUMMARY = "Development files for the Qt 6 PdfWidgets library"
DESCRIPTION = "Development files for the Qt 6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdfwidgets-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7e97ac3de027cddf57fd7767a3a637ce8d06dab9609a85d1c5bfd857bfcc3d428c3f22b71a0901748e91c1c6f441f566e3acabedcc697b6ef96122bfaa4ef012"

RPROVIDES:${PN} += "cmake-Qt6PdfWidgets \
pkgconfig-Qt6PdfWidgets \
qt6-pdfwidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Pdf \
cmake-Qt6Widgets \
libQt6PdfWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Pdf \
pkgconfig-Qt6Widgets"

inherit rpm
