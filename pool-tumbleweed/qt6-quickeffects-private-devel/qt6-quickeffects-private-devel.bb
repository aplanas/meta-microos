SUMMARY = "Qt 6 QuickEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickEffects library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickeffects-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a131190b7e8e2cfb2af5a6e912b38acee8cb0804257569fe4c8b1e36b0779feba276316713502cd0e8dbd2295198c5bbb82ef6e530c6b34593c54483adfa864a"

RPROVIDES:${PN} += "cmake-Qt6QuickEffectsPrivate \
qt6-quickeffects-private-devel"

RDEPENDS:${PN} += "libQt6QuickEffects6 \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
