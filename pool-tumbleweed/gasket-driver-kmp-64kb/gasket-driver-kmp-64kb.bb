SUMMARY = "Gasket Driver kernel modules"
DESCRIPTION = "The Linux Kernel Module Package for the Coral Gasket Driver."
LICENSE = "GPL-2.0-only"

PV = "1.0.18_k6.4.11_1"

RPM_NAME = "gasket-driver-kmp-64kb-1.0.18_k6.4.11_1-2.5.aarch64.rpm"
RPM_HASH = "e9252f657816b745984d2f9881277615927a0d85f5ac24705514f18e70fda7d1d836e25faf6ec58b006a60ac6c4367e998f3a6a231eac8589a7c02ae0253e036"

RPROVIDES:${PN} += "gasket-driver-kmp \
gasket-driver-kmp-64kb \
gasket-driver-kmp-64kb-k6.4.11-1 \
kmod-apex.ko \
kmod-gasket.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
gasket-driver-ueficert \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
