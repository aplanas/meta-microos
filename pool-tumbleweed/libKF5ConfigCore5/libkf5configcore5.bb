SUMMARY = "System for configuration files"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
KConfigCore provides access to the configuration files themselves."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5ConfigCore5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "56b75d9ec5708f82d18c84f536bc2b53b8d88f2f82de326fa56aafb307382ce0761f856abfe25353d0f64521555fbe5a86fdc75464427e7691a1d8b3aa3c151e"

RPROVIDES:${PN} += "libKF5ConfigCore.so.5 \
libKF5ConfigCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
