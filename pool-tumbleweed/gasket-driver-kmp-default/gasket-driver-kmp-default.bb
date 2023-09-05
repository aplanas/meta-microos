SUMMARY = "Gasket Driver kernel modules"
DESCRIPTION = "The Linux Kernel Module Package for the Coral Gasket Driver."
LICENSE = "GPL-2.0-only"

PV = "1.0.18_k6.4.12_1"

RPM_NAME = "gasket-driver-kmp-default-1.0.18_k6.4.12_1-2.6.aarch64.rpm"
RPM_HASH = "27fefccc84fd086dc21510ca23784ba631d7326bb27f9177897f946f7a883a884283578ad0df906fe3a12d9d427d528bec8d20c95c2fadb0dcc4fbcd6158085b"

RPROVIDES:${PN} += "gasket-driver-kmp \
gasket-driver-kmp-default \
gasket-driver-kmp-default-k6.4.12-1 \
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
