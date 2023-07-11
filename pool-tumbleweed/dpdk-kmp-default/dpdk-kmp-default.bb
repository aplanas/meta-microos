SUMMARY = "DPDK KNI kernel module"
DESCRIPTION = "The Data Plane Development Kit is a set of libraries and drivers for \
fast packet processing in the user space."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.3.9_1"

RPM_NAME = "dpdk-kmp-default-22.11.1_k6.3.9_1-2.8.aarch64.rpm"
RPM_HASH = "1affbd3305d2a643d0e91a2b536514b86480d2ea2a9fdcf388c5887f3269909af9e2a505d0f8a82fa086bb956ab7c65d433f3d902f4696207f651fa422277c82"

RPROVIDES:${PN} += "dpdk-kmp \
dpdk-kmp-default \
dpdk-kmp-default-k6.3.9-1 \
kmod-rte-kni.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
