SUMMARY = "System for configuration files"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
KConfigCore provides access to the configuration files themselves."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5ConfigCore5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "d2feb14f28319acaaa62cb087083f089eef540c2115f212feb598cd2625a4a667861d0f4b16b3481adfa02d3a0dc0167c2678781cccf133a690eff660be7a921"

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
