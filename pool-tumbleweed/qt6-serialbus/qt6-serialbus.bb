SUMMARY = "Qt 6 SerialBus library"
DESCRIPTION = "Qt 6 SerialBus library."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialbus-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "3c2d1e10b659217041d65b97fa77e14bd20fc3fd1045676be0f7fd6f47749e651b083876a69867adb574f128919825ce4f1305e1da80f0b108143528107eea73"

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
