SUMMARY = "Qt 5 Sensors library"
DESCRIPTION = "The Qt Sensors API provides access to sensor hardware via QML and C++ \
interfaces. The Qt Sensors API also provides a motion gesture \
recognition API for devices."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5Sensors5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "16076097badd2627b5ff5a58b5491de760558259030cc178d755e0223613306468d52102cb0da456163c73147952457411917661d1770b639466a7e2b6f0890c"

RPROVIDES:${PN} += "libQt5Sensors.so.5 \
libQt5Sensors5 \
libqtsensorgestures-counterplugin.so \
libqtsensorgestures-plugin.so \
libqtsensorgestures-shakeplugin.so \
libqtsensors-generic.so \
libqtsensors-iio-sensor-proxy.so \
libqtsensors-linuxsys.so"

RDEPENDS:${PN} += "-iio-sensor-proxy if systemd \
/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
