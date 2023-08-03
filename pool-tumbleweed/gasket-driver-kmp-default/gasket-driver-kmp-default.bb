SUMMARY = "Gasket Driver kernel modules"
DESCRIPTION = "The Linux Kernel Module Package for the Coral Gasket Driver."
LICENSE = "GPL-2.0-only"

PV = "1.0.18_k6.4.6_1"

RPM_NAME = "gasket-driver-kmp-default-1.0.18_k6.4.6_1-2.2.aarch64.rpm"
RPM_HASH = "1de234e53a8463506ca17ab940d9d62a56fdc1d97e6b3974660556d2e0e54bb6763d95454c73cc9c7dc25ebaa41f9ec4dcf541bfb2844912e29d448c26d85a07"

RPROVIDES:${PN} += "gasket-driver-kmp \
gasket-driver-kmp-default \
gasket-driver-kmp-default-k6.4.6-1 \
kmod-apex.ko \
kmod-gasket.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
gasket-driver-ueficert \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
