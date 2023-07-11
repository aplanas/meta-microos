SUMMARY = "DPDK KNI kernel module (thunderx)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.3.9_1"

RPM_NAME = "dpdk-thunderx-kmp-default-22.11.1_k6.3.9_1-2.8.aarch64.rpm"
RPM_HASH = "4434c90834238e002935345aa1ce3d63ae496166116ac29c467b67a5d29ad0863cbc7adf112cbc01d4394d16dceec15f0e4d05be578c8145b029256f8b083fdd"

RPROVIDES:${PN} += "dpdk-thunderx-kmp \
dpdk-thunderx-kmp-default \
dpdk-thunderx-kmp-default-k6.3.9-1 \
kmod-rte-kni.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
