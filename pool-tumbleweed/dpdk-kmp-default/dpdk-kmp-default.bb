SUMMARY = "DPDK KNI kernel module"
DESCRIPTION = "The Data Plane Development Kit is a set of libraries and drivers for \
fast packet processing in the user space."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.3.4_1"

RPM_NAME = "dpdk-kmp-default-22.11.1_k6.3.4_1-2.4.aarch64.rpm"
RPM_HASH = "ed91172903f43430a2b256f928c595660aa3aff149d307295cb0a8ca6d03f23d41a9a78f5d75488c4d9b352eba744a6f7c4e3f0535c913f1fbfe7fbae7e09530"

RPROVIDES:${PN} += "dpdk-kmp \
dpdk-kmp-default \
dpdk-kmp-default(aarch-64) \
dpdk-kmp-default-k6.3.4_1 \
kmod(rte_kni.ko) \
multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
