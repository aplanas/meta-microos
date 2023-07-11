SUMMARY = "QML imports for the Qt 5 Sensors library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5Sensors5-imports-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "5f6b131bd4754416632aaed00f03782d73d627e1786e357c105e4b61446046f78bcce2518b592a42223fc9b84e0c8758cdae1ea58f532c86240ac3c2cff6118b"

RPROVIDES:${PN} += "libQt5Sensors5-imports \
libdeclarative-sensors.so \
qt5qmlimport-QtSensors.5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5Sensors.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
