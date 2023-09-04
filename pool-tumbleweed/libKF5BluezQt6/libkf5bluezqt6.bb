SUMMARY = "Async Bluez wrapper library - development files"
DESCRIPTION = "Async Bluez wrapper library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5BluezQt6-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "7b529befe1923fd74f38d077e65b6d98d110377797f315d3f6a77a1f939ec7de37aaf32050c1fa043d44841b8829fd7e3344175e42998bb33651d1b88d85361e"

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
