SUMMARY = "Systemtap server"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the server component of systemtap."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-server-4.9-1.2.aarch64.rpm"
RPM_HASH = "2a59062e486f19643102c78a7fb1b9c030b52e8256877a9e99f327314713d473c6b03ccd377597acd0448a7b003cb2e0b96901510af9411e6ad98e1184149538"

RPROVIDES:${PN} += "systemtap-server"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
avahi \
avahi-utils \
coreutils \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libnspr4.so \
libnss3.so \
libssl3.so \
libstdc++.so.6 \
mozilla-nss-tools \
systemtap \
unzip \
zip"

inherit rpm
