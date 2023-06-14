SUMMARY = "Qt Sensors API to access sensor hardware"
DESCRIPTION = "The Qt Sensors API provides access to sensor hardware via QML and C++ \
interfaces. The Qt Sensors API also provides a motion gesture recognition API \
for devices."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8d20b328038cbc8f1f994a64f664dfbebe3c3f91f37a86ab33ab4385a4ba1ec7ba6c2dac93f6e18612e98650af54ddf5d0c05eccdadf6f47333b612399b27776"

RPROVIDES:${PN} += "libqtsensors-dummy.so \
libqtsensors-generic.so \
libqtsensors-iio-sensor-proxy.so \
qt6-sensors"

RDEPENDS:${PN} += "-iio-sensor-proxy if systemd \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Sensors.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
