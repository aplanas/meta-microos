SUMMARY = "Non-ABI stable API for the Qt 6 PdfWidgets library"
DESCRIPTION = "This package provides private headers of libQt6PdfWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdfwidgets-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "07ef99dae3f41b39776dca7bfef4c8801fe56bd135629bc1a8e7676c4752ee284633d7cdbe46fc7b6b461527b5984419789bb2e2c71941d99e0e402d2fcb0157"

RPROVIDES:${PN} += "qt6-pdfwidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PdfWidgets"

inherit rpm
