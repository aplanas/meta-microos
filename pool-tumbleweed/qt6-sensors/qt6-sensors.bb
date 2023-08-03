SUMMARY = "Qt Sensors API to access sensor hardware"
DESCRIPTION = "The Qt Sensors API provides access to sensor hardware via QML and C++ \
interfaces. The Qt Sensors API also provides a motion gesture recognition API \
for devices."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-sensors-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0ab15480ba367d7b2bc5c2551726347ce3ac2f154ffba133c141a44d38f2bf2a8c6b87835c12347ba99e2b59f6565835e0afa33184ddec53b11ac406d8a50d5a"

RPROVIDES:${PN} += "libqtsensors-generic.so \
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
