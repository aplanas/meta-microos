SUMMARY = "Task management and system monitoring library -- plugins"
DESCRIPTION = "Task management and system monitoring library. This package contains plugins."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "libksysguard5-plugins-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "2ecbb2e781b5df8976d316b617b6633c34851e5af428f150425dbc8024cfde620aa20984f57d6670cf22a2807c43f27bb123c2fdc148b05418e047cce6ce024a"

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
