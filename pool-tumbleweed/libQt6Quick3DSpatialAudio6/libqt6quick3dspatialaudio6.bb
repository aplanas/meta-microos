SUMMARY = "Qt 6 Quick3DSpatialAudio library"
DESCRIPTION = "The Qt 6 Quick3DSpatialAudio library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DSpatialAudio6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "309b3e2a4a4c4ebf347964ec2b4d5f8d82462590062cf9ab6efbb5bc52169c69e35e286e388a4de53967b585de63c98a2d4555fcf796b47c921c6eca827e5887"

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
