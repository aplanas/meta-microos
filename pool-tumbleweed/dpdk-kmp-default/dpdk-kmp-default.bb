SUMMARY = "DPDK KNI kernel module"
DESCRIPTION = "The Data Plane Development Kit is a set of libraries and drivers for \
fast packet processing in the user space."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.4.3_1"

RPM_NAME = "dpdk-kmp-default-22.11.1_k6.4.3_1-2.10.aarch64.rpm"
RPM_HASH = "7a6a9b2ba25eb2db1e1dc8e8298aa5e9f4198bd0e382d7d7a9a4bc0f61268e00693e5fac94cd85bc5363850ed06c7c6f0ddd2ed84dc4d11f6db0aa7b5e069fcb"

RPROVIDES:${PN} += "dpdk-kmp \
dpdk-kmp-default \
dpdk-kmp-default-k6.4.3-1 \
kmod-rte-kni.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
