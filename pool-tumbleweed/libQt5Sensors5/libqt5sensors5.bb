SUMMARY = "Qt 5 Sensors library"
DESCRIPTION = "The Qt Sensors API provides access to sensor hardware via QML and C++ \
interfaces. The Qt Sensors API also provides a motion gesture \
recognition API for devices."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5Sensors5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "2a335e8de33f2526f3b40f086e3540f4d1817b03f62fc2d8d07fde2404bfdf95059f5d80820fa5837c33d0dc7d2672f69277ead092152c8f5d68b444f1f9990c"

RPROVIDES:${PN} += "libQt5Sensors.so.5 \
libQt5Sensors5 \
libqtsensorgestures-counterplugin.so \
libqtsensorgestures-plugin.so \
libqtsensorgestures-shakeplugin.so \
libqtsensors-generic.so \
libqtsensors-iio-sensor-proxy.so \
libqtsensors-linuxsys.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
