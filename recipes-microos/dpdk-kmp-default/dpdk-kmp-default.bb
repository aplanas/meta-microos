SUMMARY = "DPDK KNI kernel module"
DESCRIPTION = "The Data Plane Development Kit is a set of libraries and drivers for \
fast packet processing in the user space."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.3.1_1"

RPM_NAME = "dpdk-kmp-default-22.11.1_k6.3.1_1-2.1.aarch64.rpm"
RPM_HASH = "4f2969c939d5d26a5b03e1748aa6ceff7ae9c054c695405391bf4797de1cc0a804e0e802d20392df1050ceb620159010a777ec80e1ab40fa71102a8382f2bf2b"

RPROVIDES:${PN} += "dpdk-kmp dpdk-kmp-default dpdk-kmp-default(aarch-64) dpdk-kmp-default-k6.3.1_1 kmod(rte_kni.ko) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-default kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
