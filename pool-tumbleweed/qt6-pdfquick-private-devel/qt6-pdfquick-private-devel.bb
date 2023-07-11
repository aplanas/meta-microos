SUMMARY = "Non-ABI stable API for the Qt 6 PdfQuick library"
DESCRIPTION = "This package provides private headers of libQt6PdfQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdfquick-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "9eb89c83d79aada43df1101fa981d55d5b05e8e0964c745fce0f7b6abc0c50e4bd4b4e73547cfc2818bdc53b16247f76e09c91db8fc89e4d40fc76af01d5c012"

RPROVIDES:${PN} += "qt6-pdfquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PdfQuick"

inherit rpm
