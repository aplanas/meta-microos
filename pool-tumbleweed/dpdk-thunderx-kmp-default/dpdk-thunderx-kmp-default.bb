SUMMARY = "DPDK KNI kernel module (thunderx)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.4.2_1"

RPM_NAME = "dpdk-thunderx-kmp-default-22.11.1_k6.4.2_1-2.9.aarch64.rpm"
RPM_HASH = "6fce3d59ecfb603b8f2f59ae3274566a3cabedaf6c899c602f1c353763e69cd5cb3eaf794d69cf385fca557c053367ff2c89674d7e5ca678022f680a539b96b1"

RPROVIDES:${PN} += "dpdk-thunderx-kmp \
dpdk-thunderx-kmp-default \
dpdk-thunderx-kmp-default-k6.4.2-1 \
kmod-rte-kni.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
