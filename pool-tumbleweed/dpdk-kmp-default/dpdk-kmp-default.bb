SUMMARY = "DPDK KNI kernel module"
DESCRIPTION = "The Data Plane Development Kit is a set of libraries and drivers for \
fast packet processing in the user space."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.4.11_1"

RPM_NAME = "dpdk-kmp-default-22.11.1_k6.4.11_1-2.15.aarch64.rpm"
RPM_HASH = "701ef4a207306f46f955efbef8bccd449283413ad58d1a0642907a2eb865620c01fc0744f6d36a66a0fdf529b6dc82f1908d795beb0424e6c618ea830978641c"

RPROVIDES:${PN} += "dpdk-kmp \
dpdk-kmp-default \
dpdk-kmp-default-k6.4.11-1 \
kmod-rte-kni.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
