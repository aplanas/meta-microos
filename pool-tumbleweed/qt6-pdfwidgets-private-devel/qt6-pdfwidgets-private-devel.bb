SUMMARY = "Non-ABI stable API for the Qt 6 PdfWidgets library"
DESCRIPTION = "This package provides private headers of libQt6PdfWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdfwidgets-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "866e9e9e396c63891dd108d6c8c3f0fea66d85218f998abbaea0d1782bc2858cd394bf05a1d2d9b6550b912abf96a6805deecbadfb77db6cf330a3465b3002a4"

RPROVIDES:${PN} += "qt6-pdfwidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PdfWidgets"

inherit rpm
