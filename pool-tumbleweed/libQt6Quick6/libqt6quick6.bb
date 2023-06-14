SUMMARY = "Qt 6 Quick library"
DESCRIPTION = "The Qt 6 Quick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Quick6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "cb68fce5a97633d678dbfd41cb5434702a4834965c00b53de45da217b2b07d94743b4d8ec8a0a4979c170d0611f76bea3c21d32654f8e91fce3db112fbbebe3f"

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
