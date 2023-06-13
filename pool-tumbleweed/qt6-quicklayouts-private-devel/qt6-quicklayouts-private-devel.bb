SUMMARY = "Non-ABI stable API for the Qt 6 QuickLayouts library"
DESCRIPTION = "This package provides private headers of libQt6QuickLayouts that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicklayouts-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "900d6d0bf642db9558d64f47e51b4bb1ee0f256bf630be9a517b1c340d47b5241b803ce6070941fb9e6892a394dc16426923284ffa3dff84c8aa981d9b17f2df"

RPROVIDES:${PN} += "qt6-quicklayouts-private-devel \
qt6-quicklayouts-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6QuickLayouts)"

inherit rpm
