SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.4.3_1"

RPM_NAME = "hdjmod-kmp-default-1.34_k6.4.3_1-1.12.aarch64.rpm"
RPM_HASH = "52db1314134629bb67879884359726a3de9d9c7cfb58283d1eecff4272a5214b74dfdc1982cadb204986327dd8528a7643eb1f1de266d2145cc7cfbd4558c9a4"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-default \
hdjmod-kmp-default-k6.4.3-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
