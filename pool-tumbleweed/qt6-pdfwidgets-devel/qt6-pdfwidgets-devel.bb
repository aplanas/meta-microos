SUMMARY = "Development files for the Qt 6 PdfWidgets library"
DESCRIPTION = "Development files for the Qt 6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdfwidgets-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "7bd51d407f0174f921194392f337cbc399451c6b217d0a74684667f4f9d0e51071ed7dcf927f99236069d40def9e4fd766c98aa3afbad5ade4bfe427de9c9d02"

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
