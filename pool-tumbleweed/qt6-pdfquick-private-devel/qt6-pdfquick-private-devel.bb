SUMMARY = "Non-ABI stable API for the Qt 6 PdfQuick library"
DESCRIPTION = "This package provides private headers of libQt6PdfQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdfquick-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "24e4245b3c7bbb9db4cd4c281513c57aeae9f8de26b1e9937ccdf874ee134d916a5780723ea4a9a4c4b5fbb3f1d3d1300d528f0b5b21199857ad110bfad86169"

RPROVIDES:${PN} += "qt6-pdfquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PdfQuick"

inherit rpm
