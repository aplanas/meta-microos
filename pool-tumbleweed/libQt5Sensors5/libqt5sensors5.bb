SUMMARY = "Qt 5 Sensors library"
DESCRIPTION = "The Qt Sensors API provides access to sensor hardware via QML and C++ \
interfaces. The Qt Sensors API also provides a motion gesture \
recognition API for devices."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5Sensors5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "16076097badd2627b5ff5a58b5491de760558259030cc178d755e0223613306468d52102cb0da456163c73147952457411917661d1770b639466a7e2b6f0890c"

RPROVIDES:${PN} += "libQt5Sensors.so.5()(64bit) \
libQt5Sensors.so.5(Qt_5)(64bit) \
libQt5Sensors.so.5(Qt_5.0)(64bit) \
libQt5Sensors.so.5(Qt_5.1)(64bit) \
libQt5Sensors.so.5(Qt_5.10)(64bit) \
libQt5Sensors.so.5(Qt_5.11)(64bit) \
libQt5Sensors.so.5(Qt_5.12)(64bit) \
libQt5Sensors.so.5(Qt_5.13)(64bit) \
libQt5Sensors.so.5(Qt_5.14)(64bit) \
libQt5Sensors.so.5(Qt_5.15)(64bit) \
libQt5Sensors.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Sensors.so.5(Qt_5.2)(64bit) \
libQt5Sensors.so.5(Qt_5.3)(64bit) \
libQt5Sensors.so.5(Qt_5.4)(64bit) \
libQt5Sensors.so.5(Qt_5.5)(64bit) \
libQt5Sensors.so.5(Qt_5.6)(64bit) \
libQt5Sensors.so.5(Qt_5.7)(64bit) \
libQt5Sensors.so.5(Qt_5.8)(64bit) \
libQt5Sensors.so.5(Qt_5.9)(64bit) \
libQt5Sensors5 \
libQt5Sensors5(aarch-64) \
libqtsensorgestures_counterplugin.so()(64bit) \
libqtsensorgestures_plugin.so()(64bit) \
libqtsensorgestures_shakeplugin.so()(64bit) \
libqtsensors_generic.so()(64bit) \
libqtsensors_iio-sensor-proxy.so()(64bit) \
libqtsensors_linuxsys.so()(64bit)"

RDEPENDS:${PN} += "(iio-sensor-proxy if systemd) \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Core5 \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
