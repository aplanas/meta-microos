SUMMARY = "Qt 6 QuickEffects library"
DESCRIPTION = "The Qt 6 QuickEffects library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QuickEffects6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d08bc77e82a3e9efb098d6d08706c6e051f73576687f3c4c4487f8260e67b965b737a45470637c62a3944df2ba987cbc95ead11747dd03abf12ac7a83b13fba7"

RPROVIDES:${PN} += "libQt6QuickEffects.so.6 \
libQt6QuickEffects6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
