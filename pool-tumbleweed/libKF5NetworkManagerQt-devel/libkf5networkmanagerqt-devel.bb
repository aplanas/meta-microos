SUMMARY = "A Qt wrapper for NetworkManager DBus API"
DESCRIPTION = "NetworkManagerQt provides access to all NetworkManager features \
exposed on DBus. It allows you to manage your connections and control \
your network devices and also provides a library for parsing connection \
settings which are used in DBus communication. Development files."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "libKF5NetworkManagerQt-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "141e343173a2e3311e6db849555c1098642868ea84529ab5d51ef4d827b370f499cef1114a120d474fac719e7e7559e2a39c972be319fd2d8fc99bc1dcbb82e5"

RPROVIDES:${PN} += "cmake(KF5NetworkManagerQt) \
libKF5NetworkManagerQt-devel \
libKF5NetworkManagerQt-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt5Core) \
cmake(Qt5DBus) \
cmake(Qt5Network) \
libKF5NetworkManagerQt6 \
pkgconfig(libnm)"

inherit rpm
