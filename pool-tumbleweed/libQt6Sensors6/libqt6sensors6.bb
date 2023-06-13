SUMMARY = "Qt 6 Sensors library"
DESCRIPTION = "The Qt 6 Sensors library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Sensors6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f2fa60d8d07353fd1bb199ca1f1ee3bde8238ddb669efc1aada7407ec73fe65be9ad30ff27925e2712be485c7befdb2d8e8b5a780da50990070f278a4dfd2a0b"

RPROVIDES:${PN} += "libQt6Sensors.so.6()(64bit) \
libQt6Sensors.so.6(Qt_6)(64bit) \
libQt6Sensors.so.6(Qt_6.0)(64bit) \
libQt6Sensors.so.6(Qt_6.1)(64bit) \
libQt6Sensors.so.6(Qt_6.2)(64bit) \
libQt6Sensors.so.6(Qt_6.3)(64bit) \
libQt6Sensors.so.6(Qt_6.4)(64bit) \
libQt6Sensors.so.6(Qt_6.5)(64bit) \
libQt6Sensors.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Sensors6 \
libQt6Sensors6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
