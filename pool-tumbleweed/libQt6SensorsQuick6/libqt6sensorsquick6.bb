SUMMARY = "Qt 6 SensorsQuick library"
DESCRIPTION = "The Qt6 SensorsQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6SensorsQuick6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "39f337bece9348a05caadb1c660e49556852ee2adae53114c4900269b3b3040359c304338f15f3a1573c5eb6a395089c3ff123538d5b0001ac2c682288acebf7"

RPROVIDES:${PN} += "libQt6SensorsQuick.so.6 \
libQt6SensorsQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Sensors.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
