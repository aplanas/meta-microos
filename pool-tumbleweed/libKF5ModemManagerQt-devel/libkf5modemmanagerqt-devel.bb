SUMMARY = "Development package for the libmm-qt library"
DESCRIPTION = "Qt5 wrapper for ModemManager DBus API. Development files."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "libKF5ModemManagerQt-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "a0fe0f377420f2c425933f0d29cec56cd8ddd8e21ca48d8976f7cfbf0ae4c3eca6135f22c90bee0210c843faeafeafcb5b4ed00f30fb57258407cb249d0dd0ce"

RPROVIDES:${PN} += "cmake-KF5ModemManagerQt \
libKF5ModemManagerQt-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5DBus \
libKF5ModemManagerQt6 \
pkgconfig-ModemManager"

inherit rpm
