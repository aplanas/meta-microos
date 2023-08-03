SUMMARY = "Non-ABI stable API for the Qt 6 QuickLayouts library"
DESCRIPTION = "This package provides private headers of libQt6QuickLayouts that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quicklayouts-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7a59989a922e953e03e74c9aaa63220eea063727510e31d3e93d60c74360f8cec9618b64fc701ee74034bbe4b1fd633cf84612e2124ce68bf5c9aa1ccc0fdc89"

RPROVIDES:${PN} += "qt6-quicklayouts-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickLayouts"

inherit rpm
