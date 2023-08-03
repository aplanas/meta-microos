SUMMARY = "Qt 6 RemoteObjectsQml library"
DESCRIPTION = "The Qt 6 RemoteObjectsQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6RemoteObjectsQml6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d328916954c9f37b5420951e6d0574a5dc8d23557c67e278e7305480ec4feee05ff8a035bb1801658772b50551f930ca2edba372d3d2e1245d1277b8ca725aa1"

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
