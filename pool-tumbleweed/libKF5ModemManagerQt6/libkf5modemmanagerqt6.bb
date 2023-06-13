SUMMARY = "Qt wrapper around the ModemManager libraries"
DESCRIPTION = "Qt5 wrapper for ModemManager DBus API."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "libKF5ModemManagerQt6-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "53b7ab19ea27daa41a2c91b459c532847b579a352ca2b19e3da9adeaa6a324a29ddbf95b6efcd3d3f6ac87be3969193c4ae6e5ef17457dac2dad8e0fd52301f0"

RPROVIDES:${PN} += "libKF5ModemManagerQt.so.6()(64bit) \
libKF5ModemManagerQt6 \
libKF5ModemManagerQt6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
