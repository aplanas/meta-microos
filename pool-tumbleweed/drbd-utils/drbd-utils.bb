SUMMARY = "Distributed Replicated Block Device"
DESCRIPTION = "Drbd is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.25.0"

RPM_NAME = "drbd-utils-9.25.0-1.1.aarch64.rpm"
RPM_HASH = "e7691d68e207e34e00f38a2ff729f11a6f5c76c6ba32d0d267cbc24c2a8a3e515c0891f2c48605cba92d0261a01d2f329f6edc5e8d92a81378f686806a0d2b9d"

RPROVIDES:${PN} += "config-drbd-utils \
drbd-bash-completion \
drbd-control \
drbd-pacemaker \
drbd-udev \
drbd-utils \
drbdsetup"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
