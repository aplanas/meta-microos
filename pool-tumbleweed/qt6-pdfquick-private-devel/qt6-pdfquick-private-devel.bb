SUMMARY = "Non-ABI stable API for the Qt 6 PdfQuick library"
DESCRIPTION = "This package provides private headers of libQt6PdfQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdfquick-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "de0ab704e9e0a43f00d98600e6a56e708f5a5898436c50352f87fa7c3c102cf25db126b9f0f2403bc101c860c182b264d1db33d5aef3b2faf1460aea7e0e603f"

RPROVIDES:${PN} += "qt6-pdfquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PdfQuick"

inherit rpm
