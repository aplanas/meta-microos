SUMMARY = "Qt 6 Quick3DSpatialAudio library"
DESCRIPTION = "The Qt 6 Quick3DSpatialAudio library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DSpatialAudio6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "f0df5732493749c11277ff55e8f0945d570ae1e233337644e8a98b6ffec585ee7ac5fc791c1365c1512c55b570510d7ea8c86e56da23501d20b9f811762b823b"

RPROVIDES:${PN} += "libQt6Quick3DSpatialAudio.so.6 \
libQt6Quick3DSpatialAudio6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libQt6SpatialAudio.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
