SUMMARY = "Gasket Driver kernel modules"
DESCRIPTION = "The Linux Kernel Module Package for the Coral Gasket Driver."
LICENSE = "GPL-2.0-only"

PV = "1.0.18_k6.4.12_1"

RPM_NAME = "gasket-driver-kmp-64kb-1.0.18_k6.4.12_1-2.6.aarch64.rpm"
RPM_HASH = "aa58e0df62584bed1821c4d45d795a508ca54781cc64447f8ba6f9981174976fe40122a551414dd5ac5953eb18f2fd7168b8ecb5c6d8421c8247979e9d7aa0b9"

RPROVIDES:${PN} += "gasket-driver-kmp \
gasket-driver-kmp-64kb \
gasket-driver-kmp-64kb-k6.4.12-1 \
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
