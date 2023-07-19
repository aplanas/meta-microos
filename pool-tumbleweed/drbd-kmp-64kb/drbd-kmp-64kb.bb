SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.4.3_1"

RPM_NAME = "drbd-kmp-64kb-9.0.30~1+git.8e9c0812_k6.4.3_1-8.18.aarch64.rpm"
RPM_HASH = "0b4a34b0cdb983bf14d8d4e06be2f406b41103e867f5de0bd57aecbe7208f970a258eba4a19b4a3129dc645cb7188cfa178d54662349efc0d9b4ebeda47109be"

RPROVIDES:${PN} += "drbd-kmp \
drbd-kmp-64kb \
drbd-kmp-64kb-k6.4.3-1 \
kmod-drbd-transport-tcp.ko \
kmod-drbd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
