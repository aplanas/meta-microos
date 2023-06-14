SUMMARY = "Async Bluez wrapper library - development files"
DESCRIPTION = "Async Bluez wrapper library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5BluezQt6-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "2494e0606f3df79c4c358b786d4726ee11daf0f2382c9cc38936bcd3d5eca33fdce4d0122d33b731270295c2ea191034737d1b24dc8bd6b92165c78701cb4234"

RPROVIDES:${PN} += "libKF5BluezQt.so.6 \
libKF5BluezQt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
