SUMMARY = "Qt Sensors API to access sensor hardware"
DESCRIPTION = "The Qt Sensors API provides access to sensor hardware via QML and C++ \
interfaces. The Qt Sensors API also provides a motion gesture recognition API \
for devices."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8d20b328038cbc8f1f994a64f664dfbebe3c3f91f37a86ab33ab4385a4ba1ec7ba6c2dac93f6e18612e98650af54ddf5d0c05eccdadf6f47333b612399b27776"

RPROVIDES:${PN} += "libqtsensors_dummy.so()(64bit) \
libqtsensors_dummy.so(Qt_6)(64bit) \
libqtsensors_dummy.so(Qt_6.0)(64bit) \
libqtsensors_dummy.so(Qt_6.1)(64bit) \
libqtsensors_dummy.so(Qt_6.2)(64bit) \
libqtsensors_dummy.so(Qt_6.3)(64bit) \
libqtsensors_dummy.so(Qt_6.4)(64bit) \
libqtsensors_dummy.so(Qt_6.5)(64bit) \
libqtsensors_dummy.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtsensors_generic.so()(64bit) \
libqtsensors_generic.so(Qt_6)(64bit) \
libqtsensors_generic.so(Qt_6.0)(64bit) \
libqtsensors_generic.so(Qt_6.1)(64bit) \
libqtsensors_generic.so(Qt_6.2)(64bit) \
libqtsensors_generic.so(Qt_6.3)(64bit) \
libqtsensors_generic.so(Qt_6.4)(64bit) \
libqtsensors_generic.so(Qt_6.5)(64bit) \
libqtsensors_generic.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtsensors_iio-sensor-proxy.so()(64bit) \
libqtsensors_iio-sensor-proxy.so(Qt_6)(64bit) \
libqtsensors_iio-sensor-proxy.so(Qt_6.0)(64bit) \
libqtsensors_iio-sensor-proxy.so(Qt_6.1)(64bit) \
libqtsensors_iio-sensor-proxy.so(Qt_6.2)(64bit) \
libqtsensors_iio-sensor-proxy.so(Qt_6.3)(64bit) \
libqtsensors_iio-sensor-proxy.so(Qt_6.4)(64bit) \
libqtsensors_iio-sensor-proxy.so(Qt_6.5)(64bit) \
libqtsensors_iio-sensor-proxy.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-sensors \
qt6-sensors(aarch-64)"

RDEPENDS:${PN} += "(iio-sensor-proxy if systemd) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libQt6Sensors.so.6()(64bit) \
libQt6Sensors.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
