SUMMARY = "Development package for the libmm-qt library"
DESCRIPTION = "Qt5 wrapper for ModemManager DBus API. Development files."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "libKF5ModemManagerQt-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "7004279f353b8af6c9d809e8f33ed846f8bb89d3f68c1c91c8b519eaa027cda92c55ab3242e450dd058ef485ab89e234368d80f9bea04df0f036b53711b314b7"

RPROVIDES:${PN} += "cmake-KF5ModemManagerQt \
libKF5ModemManagerQt-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5DBus \
libKF5ModemManagerQt6 \
pkgconfig-ModemManager"

inherit rpm
