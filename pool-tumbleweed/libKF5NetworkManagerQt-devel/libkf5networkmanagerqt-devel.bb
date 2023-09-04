SUMMARY = "A Qt wrapper for NetworkManager DBus API"
DESCRIPTION = "NetworkManagerQt provides access to all NetworkManager features \
exposed on DBus. It allows you to manage your connections and control \
your network devices and also provides a library for parsing connection \
settings which are used in DBus communication. Development files."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "libKF5NetworkManagerQt-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "5271e3f1c105719ac7212acd781341121f91207149abf44489247d35a696a42082e95e6e0cd5ec2ac479232c1d6aaf4c802e11ff734ae989f72e99fa43748ac9"

RPROVIDES:${PN} += "cmake-KF5NetworkManagerQt \
libKF5NetworkManagerQt-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5DBus \
cmake-Qt5Network \
libKF5NetworkManagerQt6 \
pkgconfig-libnm"

inherit rpm
