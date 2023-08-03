SUMMARY = "Gasket Driver kernel modules"
DESCRIPTION = "The Linux Kernel Module Package for the Coral Gasket Driver."
LICENSE = "GPL-2.0-only"

PV = "1.0.18_k6.4.6_1"

RPM_NAME = "gasket-driver-kmp-64kb-1.0.18_k6.4.6_1-2.2.aarch64.rpm"
RPM_HASH = "895289ba92ec93e91606e2258235444ed8b1d49635e8286ce665724b9dbe7e67d72799170a8c7e1dd7204c85042ec0c1150c1ed2b6bf9a0c17dc4e50717b2b6f"

RPROVIDES:${PN} += "gasket-driver-kmp \
gasket-driver-kmp-64kb \
gasket-driver-kmp-64kb-k6.4.6-1 \
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
