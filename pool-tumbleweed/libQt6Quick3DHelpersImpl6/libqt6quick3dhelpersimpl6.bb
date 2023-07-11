SUMMARY = "Qt 6 Quick3DHelpersImpl library"
DESCRIPTION = "The Qt 6 Quick3DHelpersImpl library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DHelpersImpl6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "41dbd9f6988574022dd8d75dc43f3a4d15c0be540d5d2730e4ab5503609ad7d63536b60daea5f33c58a905f108fe912686111e85dc4714452eb38e52947da4e3"

RPROVIDES:${PN} += "libQt6Quick3DHelpersImpl.so.6 \
libQt6Quick3DHelpersImpl6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
