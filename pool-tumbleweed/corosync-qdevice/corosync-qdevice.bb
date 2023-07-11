SUMMARY = "The Corosync Cluster Engine Qdevice"
DESCRIPTION = "This package contains the Corosync Cluster Engine Qdevice, script for creating \
NSS certificates and an init script."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "corosync-qdevice-2.4.6-1.4.aarch64.rpm"
RPM_HASH = "58fcf4489bf2803a57b2ea748d2df97dab7a6036f2710c10ef6546adc33293e6edd966bc9d61aab6c47c9c2a6269dfb9da3e24c77b0d3d02515a1ae0b6f7b936"

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
