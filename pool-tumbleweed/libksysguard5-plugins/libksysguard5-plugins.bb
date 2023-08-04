SUMMARY = "Task management and system monitoring library -- plugins"
DESCRIPTION = "Task management and system monitoring library. This package contains plugins."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libksysguard5-plugins-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "54f7c12586f654c970c120d18531576ff582175207d68a89e929a7441586dd1e034ec9bb02db3653a00a912993374890098bde6e9efe88de0df90df898bc0f79"

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
