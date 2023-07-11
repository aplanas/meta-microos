SUMMARY = "Qt 6 Quick library"
DESCRIPTION = "The Qt 6 Quick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Quick6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "b180a59cc8031b76d23806ccd73a64681f8268f556626affe59fcf2ad7d3656cf5d4aa79c0abf8d7a3dbf890a17082c153c58bf4ba32838e68d29b9c3e44f849"

RPROVIDES:${PN} += "libQt6Quick.so.6 \
libQt6Quick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
