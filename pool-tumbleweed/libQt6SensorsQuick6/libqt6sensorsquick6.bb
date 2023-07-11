SUMMARY = "Qt 6 SensorsQuick library"
DESCRIPTION = "The Qt6 SensorsQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6SensorsQuick6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "b75c75a257da68b2a1669128af5db0dbd965509eb543be08da8b7a8eea42ffb493ba62594f5ed730ae7878ee5554eb8a1818356836764a0d183db028288f4184"

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
