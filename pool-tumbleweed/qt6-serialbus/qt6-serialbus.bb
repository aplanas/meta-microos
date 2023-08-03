SUMMARY = "Qt 6 SerialBus library"
DESCRIPTION = "Qt 6 SerialBus library."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-serialbus-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e1f0b2d73847c2855e72db769f54782a8d1df05833027f6be824cdd0b6c322812c3cdb21edcfef0be0ddd951ec3d482ee7325007a8866895f24c82c2ea60a3dd"

RPROVIDES:${PN} += "libqtpassthrucanbus.so \
libqtpeakcanbus.so \
libqtsocketcanbus.so \
libqttinycanbus.so \
libqtvirtualcanbus.so \
qt6-serialbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6SerialBus.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
