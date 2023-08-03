SUMMARY = "Qt 6 Quick3DSpatialAudio library"
DESCRIPTION = "The Qt 6 Quick3DSpatialAudio library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DSpatialAudio6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f195f3822aa11ee2d84211f9731119c9bcb51f05f682309fc1f9dc7080463df5c67795cc74448a96e8a333d1f87acc379aa6556e5aeff03c09daefd318103e4b"

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
