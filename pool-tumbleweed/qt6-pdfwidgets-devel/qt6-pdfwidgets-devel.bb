SUMMARY = "Development files for the Qt 6 PdfWidgets library"
DESCRIPTION = "Development files for the Qt 6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdfwidgets-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "49d1e8e455190955e5613fdb984e90edb2443667fdcaef1eab8a04ec36a0a9cd985461e49b37792a286073a4c90e1c50d5b84860d6def4b010c628c22c0d2bbb"

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
