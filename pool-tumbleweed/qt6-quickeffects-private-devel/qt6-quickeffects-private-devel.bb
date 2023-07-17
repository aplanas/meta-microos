SUMMARY = "Qt 6 QuickEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickEffects library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickeffects-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "cb7555a6ae4f3d9302f696d9cbb4aee3b6a12be414b8287c198a14e67aa0c4c34d6def828bdbbbb1c0c68bd978159ac55a1aaa0e4582358be1fe525e0e7e8dff"

RPROVIDES:${PN} += "cmake-Qt6QuickEffectsPrivate \
qt6-quickeffects-private-devel"

RDEPENDS:${PN} += "libQt6QuickEffects6 \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
