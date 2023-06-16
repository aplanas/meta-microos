SUMMARY = "The Corosync Cluster Engine Qdevice Network Daemon"
DESCRIPTION = "This package contains the Corosync Cluster Engine Qdevice Network Daemon, script for creating \
NSS certificates and an init script."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "corosync-qnetd-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "17308e70731fbf70476b67762dd826032e8db1b21f9ebf24b47e08aa88f2329b7dabf124a2112dd0871654d15086db41272c43095bedb175e04bb278deb6927f"

RPROVIDES:${PN} += "config-corosync-qnetd \
corosync-qnetd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
/usr/sbin/useradd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libssl3.so \
mozilla-nss-tools"

inherit rpm
