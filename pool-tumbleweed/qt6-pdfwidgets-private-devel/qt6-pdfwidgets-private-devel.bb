SUMMARY = "Non-ABI stable API for the Qt 6 PdfWidgets library"
DESCRIPTION = "This package provides private headers of libQt6PdfWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdfwidgets-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "88981bd44fe4cbd7b3c23c10714d50960d8b415d2ba23468bf8639f9dc642f84eacb6fc0c08ae44a992e75f472113bbafb3552a25215293364d4f0b2698671a3"

RPROVIDES:${PN} += "qt6-pdfwidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PdfWidgets"

inherit rpm
