SUMMARY = "A Qt wrapper for NetworkManager DBus API"
DESCRIPTION = "NetworkManagerQt provides access to all NetworkManager features \
exposed on DBus. It allows you to manage your connections and control \
your network devices and also provides a library for parsing connection \
settings which are used in DBus communication."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "libKF5NetworkManagerQt6-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "79ce011d9813837b0a0f17479ce2dadca262a0467e57d3d4ccae33d7571350a9aced9f96e64b268389347461323bdea1244f34bae513cdf744648b5eb489488e"

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
