SUMMARY = "Development files for the Qt 6 PdfQuick library"
DESCRIPTION = "Development files for the Qt 6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdfquick-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "21b4abd7e80c34e155f25a2df9c6b033013f21f021a41615e4dd860d528d07562719a94fb18acba6c53bef7958c93eb27c61d7efb0650087eed07138cc46d593"

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
