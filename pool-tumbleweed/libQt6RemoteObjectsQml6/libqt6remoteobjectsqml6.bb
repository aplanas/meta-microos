SUMMARY = "Qt 6 RemoteObjectsQml library"
DESCRIPTION = "The Qt 6 RemoteObjectsQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6RemoteObjectsQml6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "49d9f9fe8400112ac11ca24609517cd15a3f0e24b3947863fd2f0574997fa0f7be3c5580b4bca66b198f55800a1a676a662fe56d60171ce7e1d319d1bf7c944d"

RPROVIDES:${PN} += "libQt6RemoteObjectsQml.so.6 \
libQt6RemoteObjectsQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6RemoteObjects.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
