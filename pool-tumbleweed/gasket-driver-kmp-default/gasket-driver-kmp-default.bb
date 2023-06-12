SUMMARY = "Gasket Driver kernel modules"
DESCRIPTION = "The Linux Kernel Module Package for the Coral Gasket Driver."
LICENSE = "GPL-2.0-only"

PV = "1.0.18_k6.3.4_1"

RPM_NAME = "gasket-driver-kmp-default-1.0.18_k6.3.4_1-1.3.aarch64.rpm"
RPM_HASH = "7c391c320a965dfe1c167d60419ee8f3013cc441a3a1d5fe4f65150591b7ef0e623a64f860e0c0fe9e2e07ef5861e500635e4f2eab45f86a8bc81352cec93f49"

RPROVIDES:${PN} += "gasket-driver-kmp \
gasket-driver-kmp-default \
gasket-driver-kmp-default(aarch-64) \
gasket-driver-kmp-default-k6.3.4_1 \
kmod(apex.ko) \
kmod(gasket.ko) \
multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
gasket-driver-ueficert \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
