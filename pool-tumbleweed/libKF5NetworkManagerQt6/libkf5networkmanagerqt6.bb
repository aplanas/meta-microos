SUMMARY = "A Qt wrapper for NetworkManager DBus API"
DESCRIPTION = "NetworkManagerQt provides access to all NetworkManager features \
exposed on DBus. It allows you to manage your connections and control \
your network devices and also provides a library for parsing connection \
settings which are used in DBus communication."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "libKF5NetworkManagerQt6-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "9f0ea1fed08c7d3c2914cc782eefbc3f8aae3e09a4653d3740ae9bd12e47c99c0eddf28d9c544047b4cd56725dd5f7bec24f14eed78579e061a148385892b00b"

RPROVIDES:${PN} += "libKF5NetworkManagerQt.so.6()(64bit) \
libKF5NetworkManagerQt6 \
libKF5NetworkManagerQt6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
