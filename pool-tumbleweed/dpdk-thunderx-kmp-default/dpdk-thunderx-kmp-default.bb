SUMMARY = "DPDK KNI kernel module (thunderx)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.4.6_1"

RPM_NAME = "dpdk-thunderx-kmp-default-22.11.1_k6.4.6_1-2.12.aarch64.rpm"
RPM_HASH = "224097fd3998aeef8aceb39ac93b706b118ff6f08f4febd768994a4479d7d82d81b9779d6e94d9b841f274f3b4f8c936b71a19b2784a4823580fc3f5525f3ff8"

RPROVIDES:${PN} += "dpdk-thunderx-kmp \
dpdk-thunderx-kmp-default \
dpdk-thunderx-kmp-default-k6.4.6-1 \
kmod-rte-kni.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
