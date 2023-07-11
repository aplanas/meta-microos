SUMMARY = "A Qt wrapper for NetworkManager DBus API"
DESCRIPTION = "NetworkManagerQt provides access to all NetworkManager features \
exposed on DBus. It allows you to manage your connections and control \
your network devices and also provides a library for parsing connection \
settings which are used in DBus communication. Development files."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "libKF5NetworkManagerQt-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "561e00f056cc1d47b71c88a1752078e7e62ffe90e388cc11da3fa7ec6d173bec8c23c246451e9a55f15673fbcb79a26edfc7423558ba0fd3b745fff1108dbc69"

RPROVIDES:${PN} += "cmake-KF5NetworkManagerQt \
libKF5NetworkManagerQt-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5DBus \
cmake-Qt5Network \
libKF5NetworkManagerQt6 \
pkgconfig-libnm"

inherit rpm
