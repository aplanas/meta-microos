SUMMARY = "A Qt wrapper for NetworkManager DBus API"
DESCRIPTION = "NetworkManagerQt provides access to all NetworkManager features \
exposed on DBus. It allows you to manage your connections and control \
your network devices and also provides a library for parsing connection \
settings which are used in DBus communication. Development files."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "libKF5NetworkManagerQt-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "ea391b74885f98544c23dd6f48696e4ed108cfe1a5b8152b46503ce50258be8b6b2d6747da24b8ab0492f6da58e521f72201063aa5fdb1c69e8d92d4dca3fe1e"

RPROVIDES:${PN} += "cmake-KF5NetworkManagerQt \
libKF5NetworkManagerQt-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5DBus \
cmake-Qt5Network \
libKF5NetworkManagerQt6 \
pkgconfig-libnm"

inherit rpm
