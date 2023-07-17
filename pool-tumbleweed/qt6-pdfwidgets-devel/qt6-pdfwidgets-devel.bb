SUMMARY = "Development files for the Qt 6 PdfWidgets library"
DESCRIPTION = "Development files for the Qt 6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdfwidgets-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "3d67762d170b533e55db065eb85e689042783ec13bc60466dec1486adc241ba1a73b282da1ce6a1ed85c1207d74e3c22deedf2f54b045914c47e78ddced8283f"

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
