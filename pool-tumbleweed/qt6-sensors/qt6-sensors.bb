SUMMARY = "Qt Sensors API to access sensor hardware"
DESCRIPTION = "The Qt Sensors API provides access to sensor hardware via QML and C++ \
interfaces. The Qt Sensors API also provides a motion gesture recognition API \
for devices."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "57f1af18f821c60e2fbdaf97e05a20c0d046298c996f52543685a0e203179b4e8522319459c08d495d9e4c19bad5118ba029e2b5c64e7173339d4821a589dc58"

RPROVIDES:${PN} += "libqtsensors-dummy.so \
libqtsensors-generic.so \
libqtsensors-iio-sensor-proxy.so \
qt6-sensors"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Sensors.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
