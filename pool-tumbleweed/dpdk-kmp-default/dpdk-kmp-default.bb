SUMMARY = "DPDK KNI kernel module"
DESCRIPTION = "The Data Plane Development Kit is a set of libraries and drivers for \
fast packet processing in the user space."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.4.6_1"

RPM_NAME = "dpdk-kmp-default-22.11.1_k6.4.6_1-2.12.aarch64.rpm"
RPM_HASH = "b8cb1b6358d46bfdd93df402e82683878caa1ca14d83ec6ed1a5c2e69599d2dd6f248a988640e62bef24b157966902009d2e40086c5cb85102da460a84fb0937"

RPROVIDES:${PN} += "dpdk-kmp \
dpdk-kmp-default \
dpdk-kmp-default-k6.4.6-1 \
kmod-rte-kni.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
