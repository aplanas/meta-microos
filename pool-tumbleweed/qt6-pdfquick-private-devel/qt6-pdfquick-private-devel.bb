SUMMARY = "Non-ABI stable API for the Qt 6 PdfQuick library"
DESCRIPTION = "This package provides private headers of libQt6PdfQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdfquick-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "86eda3d58b0af493e6034c9bf1a1076e9be59c74d0b6872a34006c819fa7f698489eac7d7d8ba4fa8740daf2a4ebb73610610c43083d7e1f24110f2217c2b2db"

RPROVIDES:${PN} += "qt6-pdfquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PdfQuick"

inherit rpm
