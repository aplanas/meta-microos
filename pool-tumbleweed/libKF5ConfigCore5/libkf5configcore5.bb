SUMMARY = "System for configuration files"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
KConfigCore provides access to the configuration files themselves."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5ConfigCore5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "1a6358ee9d833ecf3ba29cff24eeb44802ad02a4f090b9f51fd67c3486b6dbfbb385591c2d3e7ae164a3ada53f8b1cf19683e1c986b9e6b9ea57c96b06b91e29"

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
