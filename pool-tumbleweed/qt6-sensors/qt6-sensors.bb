SUMMARY = "Qt Sensors API to access sensor hardware"
DESCRIPTION = "The Qt Sensors API provides access to sensor hardware via QML and C++ \
interfaces. The Qt Sensors API also provides a motion gesture recognition API \
for devices."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "8f79a72e87e5a700ab170f34e345f8a35d3e8fc65a8fd136f32095d5a9e1c13bc3beb2f9475c6c7ae898c4d66bec793c8b7f26b57c617dbbabc89800de6bd9c9"

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
