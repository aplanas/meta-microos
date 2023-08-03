SUMMARY = "Qt6 QmlCompiler library"
DESCRIPTION = "The Qt 6 QmlCompiler library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QmlCompiler6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f5eafc1b2de97d86194ef0e37b11cbc9ca5ac3ccb3a44c0a0dec0bd2742520a5a107766297ffd14be9b8207b20310ab8e4378b63e02cfdfa9b1437dc03b9ab05"

RPROVIDES:${PN} += "libQt6QmlCompiler.so.6 \
libQt6QmlCompiler6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
