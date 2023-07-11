SUMMARY = "The Corosync Cluster Engine Qdevice Network Daemon"
DESCRIPTION = "This package contains the Corosync Cluster Engine Qdevice Network Daemon, script for creating \
NSS certificates and an init script."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "corosync-qnetd-2.4.6-1.4.aarch64.rpm"
RPM_HASH = "163b252ad08af1c7c8d49e6ccb53d2fe27a71d588e3eba6572567af9c5a5768091c48407670240b11295295dc23d29b950da167b61a376e03395a95775760a52"

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
