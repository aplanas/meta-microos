SUMMARY = "Gasket Driver kernel modules"
DESCRIPTION = "The Linux Kernel Module Package for the Coral Gasket Driver."
LICENSE = "GPL-2.0-only"

PV = "1.0.18_k6.4.11_1"

RPM_NAME = "gasket-driver-kmp-default-1.0.18_k6.4.11_1-2.5.aarch64.rpm"
RPM_HASH = "e314e66e919e9c99fca3254b7088dac6b8282cf8e2292b7f4df1ebbc9addae1dd8904eaa1bd56eed15370f8eee8f063f1efa4bb8bcbf4a2408ba5608d77b17c0"

RPROVIDES:${PN} += "gasket-driver-kmp \
gasket-driver-kmp-default \
gasket-driver-kmp-default-k6.4.11-1 \
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
