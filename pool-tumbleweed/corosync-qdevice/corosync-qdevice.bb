SUMMARY = "The Corosync Cluster Engine Qdevice"
DESCRIPTION = "This package contains the Corosync Cluster Engine Qdevice, script for creating \
NSS certificates and an init script."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "corosync-qdevice-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "08757bc65bbd6e563b193ae2d411eb3ddd61d3fcaaabc13acf6ad3219ee1317cd0ff7839b30b33e8b66ae0e27cbe548daf3ae4d07b822821bbd26014b85d7d6b"

RPROVIDES:${PN} += "config-corosync-qdevice \
corosync-qdevice"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
corosync \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmap.so.4 \
libcorosync-common.so.4 \
libnspr4.so \
libnss3.so \
libssl3.so \
libvotequorum.so.8 \
mozilla-nss-tools"

inherit rpm
