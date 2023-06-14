SUMMARY = "Examples for the qt6-location modules"
DESCRIPTION = "Examples for the qt6-location modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "04e3f318ffb7cb0d7b22191c13e215a3d48f9e71010b3839f8fc91f8f6ac611d797f87d4739fbdd0062c55cf0fc67a201335d412d9db9adca4ed5755ffab32d5"

RPROVIDES:${PN} += "qt6-location-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
