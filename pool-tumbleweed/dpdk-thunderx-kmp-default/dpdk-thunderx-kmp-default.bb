SUMMARY = "DPDK KNI kernel module (thunderx)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.4.12_1"

RPM_NAME = "dpdk-thunderx-kmp-default-22.11.1_k6.4.12_1-2.16.aarch64.rpm"
RPM_HASH = "9fd9d413521625af90486f4b4ff625fbe4514782ffeb2376eccea150453554f4ba256d2d598dec3e7c63a17664787c2825f07db9a45478affbd89b69374e0e5a"

RPROVIDES:${PN} += "dpdk-thunderx-kmp \
dpdk-thunderx-kmp-default \
dpdk-thunderx-kmp-default-k6.4.12-1 \
kmod-rte-kni.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
