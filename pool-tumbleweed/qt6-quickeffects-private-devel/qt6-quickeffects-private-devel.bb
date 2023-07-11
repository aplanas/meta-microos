SUMMARY = "Qt 6 QuickEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickEffects library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickeffects-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "a5618f9d0e27b020e1671a5d0c2223bdbd32dc95d2e9acb4c46c03c6d3c22b1fa48a5b1ecce00581965943bf766a885fbdd964604e93cd2c215d85c1701e7cec"

RPROVIDES:${PN} += "cmake-Qt6QuickEffectsPrivate \
qt6-quickeffects-private-devel"

RDEPENDS:${PN} += "libQt6QuickEffects6 \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
