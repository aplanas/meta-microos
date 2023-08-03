SUMMARY = "Development files for the Qt 6 PdfQuick library"
DESCRIPTION = "Development files for the Qt 6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdfquick-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "303ce23b61be4bbfb164f65eba04a72cf392aae8e089467bdeb022929aaf53f21bae4a0587a8969ad3fdeea1068c9e6f3e0cc75a7b1966350b5a74b71d9d2afc"

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
