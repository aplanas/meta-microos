SUMMARY = "Gasket Driver kernel modules"
DESCRIPTION = "The Linux Kernel Module Package for the Coral Gasket Driver."
LICENSE = "GPL-2.0-only"

PV = "1.0.18_k6.3.9_1"

RPM_NAME = "gasket-driver-kmp-64kb-1.0.18_k6.3.9_1-1.7.aarch64.rpm"
RPM_HASH = "a9196026e72143f49fbb8884e26a433e92ddb353ad9df93922d786e1319d63793647d3970937f910ebea384a3161d528d2f2b4928442a2b6f58b5bd9e0602042"

RPROVIDES:${PN} += "gasket-driver-kmp \
gasket-driver-kmp-64kb \
gasket-driver-kmp-64kb-k6.3.9-1 \
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
