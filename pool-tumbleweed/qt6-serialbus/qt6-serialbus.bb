SUMMARY = "Qt 6 SerialBus library"
DESCRIPTION = "Qt 6 SerialBus library."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialbus-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4dfd85353e815fba99014510b074c7235c9ef40acbb21ca07851ae07454a485bce929679e2c4483a0612e7f66b336e14218176a3da404c2c051420d485e7bb8f"

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
