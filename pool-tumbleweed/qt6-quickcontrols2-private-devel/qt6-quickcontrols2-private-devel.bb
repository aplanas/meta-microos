SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrols2-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "c22982e78b5969e39c77b7953a10d559f8b764e317f5ad0ba15088ee905a215983273a4f3e11c9b03e743e40208c8e5a52ffdf28f91463584e52b134cc8e76e5"

RPROVIDES:${PN} += "qt6-quickcontrols2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickControls2"

inherit rpm
