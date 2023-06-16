SUMMARY = "Plugin based system monitoring daemon"
DESCRIPTION = "KSystemStats is a daemon that collects statistics about the running system."
LICENSE = "BSD-2-Clause & BSD-3-Clause & CC0-1.0 & GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "ksystemstats5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "31c7f5c538353e2ab1a1cb64e39c9cdcfeaf8423fe61187a725385234b109dca9995c47e8287b3628781260fb0eb1f64c4e31129297c1e2f6365750e7b488fae"

RPROVIDES:${PN} += "ksystemstats5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5Solid.so.5 \
libKSysGuardFormatter.so.1 \
libKSysGuardSystemStats.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libsensors.so.4 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
