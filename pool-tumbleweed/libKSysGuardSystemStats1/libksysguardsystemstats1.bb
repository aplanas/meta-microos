SUMMARY = "Library for system monitoring plugins for KSystemStats"
DESCRIPTION = "This library is used by plugins for KSystemStats, a system monitoring daemon."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libKSysGuardSystemStats1-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "cf1c82921d41ae5bbeb85e0dbfb19603c00ce119a758b05e444ba22d4f719561c136da3f8bd47c5bc468b959f93998592ff2648ba09651e866ccddbe10c8bd34"

RPROVIDES:${PN} += "libKSysGuardSystemStats.so.1 \
libKSysGuardSystemStats1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ksysguardsystemstats-data \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libsensors.so.4 \
libstdc++.so.6"

inherit rpm
