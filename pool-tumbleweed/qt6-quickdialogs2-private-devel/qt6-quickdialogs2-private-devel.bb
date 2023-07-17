SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "29d8921b9946c971c6cdfe2d8d8b4db758287634b9d77b454f133850951518c511cb41905a804b37515a90a0f596a9b4f17d9ee02d0be6b92ca355c24f49edce"

RPROVIDES:${PN} += "qt6-quickdialogs2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2 \
qt6-qmlmodels-private-devel"

inherit rpm
