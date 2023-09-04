SUMMARY = "A Qt wrapper for NetworkManager DBus API"
DESCRIPTION = "NetworkManagerQt provides access to all NetworkManager features \
exposed on DBus. It allows you to manage your connections and control \
your network devices and also provides a library for parsing connection \
settings which are used in DBus communication."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "libKF5NetworkManagerQt6-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "80904ea04b176bea9d002f1944d6e08392a0651a1aa29e74f5e0339d975d8a4158f6e50248d3b5aeee1aefa47af4361c3b2b522640c67cd95e50d736e9a1384b"

RPROVIDES:${PN} += "libKF5NetworkManagerQt.so.6 \
libKF5NetworkManagerQt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
