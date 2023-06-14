SUMMARY = "Distributed Replicated Block Device"
DESCRIPTION = "Drbd is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.19.0"

RPM_NAME = "drbd-utils-9.19.0-11.1.aarch64.rpm"
RPM_HASH = "7457b2a1b24b3dc6f7f9096440a886cfc95e99df871bc46f0975b628e74d469300b94e6c2e736f724c1689de800a35c9f4145723beca0e62cf7eab73cf5bd79f"

RPROVIDES:${PN} += "config-drbd-utils \
drbd-bash-completion \
drbd-control \
drbd-pacemaker \
drbd-udev \
drbd-utils \
drbdsetup"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
