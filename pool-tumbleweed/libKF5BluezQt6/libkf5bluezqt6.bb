SUMMARY = "Async Bluez wrapper library - development files"
DESCRIPTION = "Async Bluez wrapper library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5BluezQt6-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "4130bed3d35797a95f44e365159ef611cade0aa855990733b1aa711fc7cfcf3f0ed540b779b75415be0cdcd9581930cc4f8365a38d0f4585863c5d8328a1f187"

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
