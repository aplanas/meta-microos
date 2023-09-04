SUMMARY = "Qt 6 QuickEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickEffects library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickeffects-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "4afc988d76d7fd75bb0c1c62ffd2942ffd028772f507b87a0bb99cc210058928da5649e0d0394b6058d12849cb2a2b63b35f1dacd75d094b36bcc5ae016dc2ad"

RPROVIDES:${PN} += "cmake-Qt6QuickEffectsPrivate \
qt6-quickeffects-private-devel"

RDEPENDS:${PN} += "libQt6QuickEffects6 \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
