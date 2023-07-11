SUMMARY = "Gasket Driver kernel modules"
DESCRIPTION = "The Linux Kernel Module Package for the Coral Gasket Driver."
LICENSE = "GPL-2.0-only"

PV = "1.0.18_k6.3.9_1"

RPM_NAME = "gasket-driver-kmp-default-1.0.18_k6.3.9_1-1.7.aarch64.rpm"
RPM_HASH = "309b72da59f2409b8b19eae5b04ffabf854eb74d8cc38ded1834ebac3382c539e75436c432de4b14f520279c37d1a1de011f2317a2a1949a34b1195884fe534a"

RPROVIDES:${PN} += "gasket-driver-kmp \
gasket-driver-kmp-default \
gasket-driver-kmp-default-k6.3.9-1 \
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
