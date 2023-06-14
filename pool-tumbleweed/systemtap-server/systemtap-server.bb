SUMMARY = "Systemtap server"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the server component of systemtap."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-server-4.9-1.1.aarch64.rpm"
RPM_HASH = "7f284850ed8953d966aef4a734922de80474d4033949b39899de95590761749ac852d8b7e42689a37d4948d00d0e8aa788d0531c6027aa53b8f4c543d79dcd63"

RPROVIDES:${PN} += "systemtap-server"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
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
