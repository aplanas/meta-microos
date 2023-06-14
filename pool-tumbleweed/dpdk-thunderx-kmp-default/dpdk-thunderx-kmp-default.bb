SUMMARY = "DPDK KNI kernel module (thunderx)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.3.4_1"

RPM_NAME = "dpdk-thunderx-kmp-default-22.11.1_k6.3.4_1-2.4.aarch64.rpm"
RPM_HASH = "3a3ba23ab43a8efad01157ac6627939f996b0d7b424171ea6492edb47d064f1b575790a3b1e7279444c60265cf63b921416f266c6bc708a2f966d5bfb8b1250c"

RPROVIDES:${PN} += "dpdk-thunderx-kmp \
dpdk-thunderx-kmp-default \
dpdk-thunderx-kmp-default-k6.3.4-1 \
kmod-rte-kni.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
