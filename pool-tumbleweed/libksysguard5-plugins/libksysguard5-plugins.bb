SUMMARY = "Task management and system monitoring library -- plugins"
DESCRIPTION = "Task management and system monitoring library. This package contains plugins."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libksysguard5-plugins-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "89aeb517900b61e0b6bcaa64e2ffc980793d7ce1b5760dcde5632a2229bf9110590894183d2f7b816282e04ce6263a13ef4e4c3b49e07f11743506eb3afdd0b1"

RPROVIDES:${PN} += "libksysguard5-helper \
libksysguard5-plugins"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libksysguard5 \
libnl-3.so.200 \
libpcap.so.1 \
libprocesscore.so.9 \
libstdc++.so.6 \
permissions"

inherit rpm
