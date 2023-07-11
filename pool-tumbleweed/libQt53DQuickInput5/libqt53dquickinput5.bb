SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
Qt 3D provides functionality for near-realtime simulation \
systems with support for 2D and 3D rendering in both Qt C++ and Qt Quick applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DQuickInput5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "861928172b68eb0c152a08267cda78ca8c37c1405afbcf4c51b5ff9b39c197db3d75cab3cac78db646dbe3a5d56e45520cd1e0bcf8a0dc3bb0824f1d2e4d510a"

RPROVIDES:${PN} += "libQt53DQuickInput.so.5 \
libQt53DQuickInput5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt53DInput.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
