SUMMARY = "A Qt wrapper for NetworkManager DBus API"
DESCRIPTION = "NetworkManagerQt provides access to all NetworkManager features \
exposed on DBus. It allows you to manage your connections and control \
your network devices and also provides a library for parsing connection \
settings which are used in DBus communication."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "libKF5NetworkManagerQt6-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e7dfbe78fdc8d3b686a6e5e2d8c28d8827c79f7c1e067a0a74e0548d532fb1136cb58e46e22613b4ab11e6f7077444d039eadfe8e7110dd34bf76571271254ab"

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
