SUMMARY = "DPDK KNI kernel module"
DESCRIPTION = "The Data Plane Development Kit is a set of libraries and drivers for \
fast packet processing in the user space."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.4.2_1"

RPM_NAME = "dpdk-kmp-default-22.11.1_k6.4.2_1-2.9.aarch64.rpm"
RPM_HASH = "04d8cc2317f28f69138441b4e634b59cc043cb88605642580c87bc11a6d13c2805036a88587eb9dd8b553b5f41aa74b6b7b09fdc9f6e3a2b0a4223c5b51f7fb9"

RPROVIDES:${PN} += "dpdk-kmp \
dpdk-kmp-default \
dpdk-kmp-default-k6.4.2-1 \
kmod-rte-kni.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
