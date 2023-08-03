SUMMARY = "Non-ABI stable API for the Qt 6 PdfWidgets library"
DESCRIPTION = "This package provides private headers of libQt6PdfWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdfwidgets-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0104281d51f06e07618d477882a21f3a7002342522255ac6c044805be8026fca86299106ff69d2a3d8fb5efad349139828ee2d0ed7bcd5e2e4ca66ebf10a71ea"

RPROVIDES:${PN} += "qt6-pdfwidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PdfWidgets"

inherit rpm
