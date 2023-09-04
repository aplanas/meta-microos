SUMMARY = "DPDK KNI kernel module (thunderx)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.4.11_1"

RPM_NAME = "dpdk-thunderx-kmp-default-22.11.1_k6.4.11_1-2.15.aarch64.rpm"
RPM_HASH = "bdc522b5526844423827d0c31d02d10eee96a6d1f7b6eb5b012719ed520183b74a49ef7239d5bd62f29ec33ae1b598d1a3147842f2b0dcb5d96043746caf45b2"

RPROVIDES:${PN} += "dpdk-thunderx-kmp \
dpdk-thunderx-kmp-default \
dpdk-thunderx-kmp-default-k6.4.11-1 \
kmod-rte-kni.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
