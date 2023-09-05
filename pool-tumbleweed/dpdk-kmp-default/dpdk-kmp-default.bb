SUMMARY = "DPDK KNI kernel module"
DESCRIPTION = "The Data Plane Development Kit is a set of libraries and drivers for \
fast packet processing in the user space."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.4.12_1"

RPM_NAME = "dpdk-kmp-default-22.11.1_k6.4.12_1-2.16.aarch64.rpm"
RPM_HASH = "12d51e94eefbea4b880d6dd5f57e49a20963bdec725cef9ca6532877f9dd1134bc71d24543ca997aff0e6d32f6a5617872e3d74d97ce049547253dfaf184a308"

RPROVIDES:${PN} += "dpdk-kmp \
dpdk-kmp-default \
dpdk-kmp-default-k6.4.12-1 \
kmod-rte-kni.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
