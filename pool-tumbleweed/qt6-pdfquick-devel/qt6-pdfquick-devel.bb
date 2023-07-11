SUMMARY = "Development files for the Qt 6 PdfQuick library"
DESCRIPTION = "Development files for the Qt 6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdfquick-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "32f4c9e6a867741ced5db84776242f9e8e73e8f550d2d96d4d5765266dee22e47413b812c8bc6e72a14ae1e89bcddc52c9a51cba4c94228184ee3a89adb2c130"

RPROVIDES:${PN} += "cmake-Qt6PdfQuick \
pkgconfig-Qt6PdfQuick \
qt6-pdfquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt6PdfQuick6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Pdf \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
qt6-pdf-private-devel \
qt6-quick-private-devel"

inherit rpm
