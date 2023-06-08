SUMMARY = "DPDK KNI kernel module (thunderx)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1_k6.3.1_1"

RPM_NAME = "dpdk-thunderx-kmp-default-22.11.1_k6.3.1_1-2.1.aarch64.rpm"
RPM_HASH = "78c795fa2145cd9ef1c6f7f237c59eb7af222268acc1aaecb22a180f45a8ed5c73ccf1865ce5ac8945447392a9f0872da897f0325643b9a5a3453a7a19e4bfcf"

RPROVIDES:${PN} += "dpdk-thunderx-kmp dpdk-thunderx-kmp-default dpdk-thunderx-kmp-default(aarch-64) dpdk-thunderx-kmp-default-k6.3.1_1 kmod(rte_kni.ko) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-default kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
