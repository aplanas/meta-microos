SUMMARY = "Development files for the Qt 6 PdfQuick library"
DESCRIPTION = "Development files for the Qt 6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdfquick-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "0ee88d41033c6f6de2dd445a82659abae0af0114568a6dae1db1a8ed6d79065376fa873ff29c4b4551dd81b421e40d5cf687bc6784a8f5d5f8b6e738be7e2ba6"

RPROVIDES:${PN} += "cmake-Qt6PdfQuick \
pkgconfig-Qt6PdfQuick \
qt6-pdfquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6PdfQuick6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Pdf \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
qt6-pdf-private-devel \
qt6-quick-private-devel"

inherit rpm
