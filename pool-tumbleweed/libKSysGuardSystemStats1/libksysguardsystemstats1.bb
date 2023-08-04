SUMMARY = "Library for system monitoring plugins for KSystemStats"
DESCRIPTION = "This library is used by plugins for KSystemStats, a system monitoring daemon."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libKSysGuardSystemStats1-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "3130dbd2ab9836d88717bc5e3c58d31ba30725a4db52a9b82f40598f7ee60591a497dd6dc99c0b5c922e7d284c7b08547acb639922cf659befd9009310a1a7f6"

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
