SUMMARY = "Qt 6 SensorsQuick library"
DESCRIPTION = "The Qt6 SensorsQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6SensorsQuick6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4456b81afde5c1f8389153e0ea7878464806c2f36af869c56bd24b1f043d69de07f4ed3e732d411e1dd0f47dbf1ad702911246f6597904594d40a223cd05f892"

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
