SUMMARY = "Library for system monitoring plugins for KSystemStats"
DESCRIPTION = "This library is used by plugins for KSystemStats, a system monitoring daemon."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "libKSysGuardSystemStats1-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "32e8645ecf3e21859ee99b9dde1af2bf9b538c62bd21838e11e174dd8fe994bcac279c87d953e6bb51f4396fab606cd72504df9475c985ddda6ceed78e7d350f"

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
