SUMMARY = "Plugin based system monitoring daemon"
DESCRIPTION = "KSystemStats is a daemon that collects statistics about the running system."
LICENSE = "BSD-2-Clause & BSD-3-Clause & CC0-1.0 & GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "ksystemstats5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "df1d4d74dbbb4d1f25d8d0f46862474b07fd2144a9c0c0f39bdc870dc48ddbec73ae3da3e567fb85e6b85a0bb22569e85a23af5164ef0257911cfc3586459963"

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
