SUMMARY = "DPDK KNI kernel module (thunderx)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.4.3_1"

RPM_NAME = "dpdk-thunderx-kmp-default-22.11.1_k6.4.3_1-2.10.aarch64.rpm"
RPM_HASH = "5a60399b084c4ac8c22f550be4043fa00d1b5d850aa0b4df7d91b34a21ba97b432e45c62fdee1da2209a9f4f80f710dc8a97a2afdaa72d30abf88105d57eb2cd"

RPROVIDES:${PN} += "dpdk-thunderx-kmp \
dpdk-thunderx-kmp-default \
dpdk-thunderx-kmp-default-k6.4.3-1 \
kmod-rte-kni.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
