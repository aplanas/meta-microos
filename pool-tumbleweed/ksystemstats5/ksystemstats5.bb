SUMMARY = "Plugin based system monitoring daemon"
DESCRIPTION = "KSystemStats is a daemon that collects statistics about the running system."
LICENSE = "BSD-2-Clause & BSD-3-Clause & CC0-1.0 & GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "ksystemstats5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "96bc51a6ff08227ff79618a066a93f71c587ca9ae7751cad69b5b05ca1eb1edf7675f376c3b36df449ec35dec9a33ee189d7f29a4cff98c00c046052e53000c0"

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
