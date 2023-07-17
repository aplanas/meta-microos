SUMMARY = "Development package for the libmm-qt library"
DESCRIPTION = "Qt5 wrapper for ModemManager DBus API. Development files."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "libKF5ModemManagerQt-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "26430a4656a1fc5ecd0cfc80e34290c14e9a67b6cb6d454fc092f4df3a59a1a8bd4dbfe66b1a349e3d88a9832b8448731a5aed2343588073bfeceb3e5de55245"

RPROVIDES:${PN} += "cmake-KF5ModemManagerQt \
libKF5ModemManagerQt-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5DBus \
libKF5ModemManagerQt6 \
pkgconfig-ModemManager"

inherit rpm
