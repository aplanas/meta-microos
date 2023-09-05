SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.4.12_1"

RPM_NAME = "hdjmod-kmp-64kb-1.34_k6.4.12_1-1.18.aarch64.rpm"
RPM_HASH = "9beee7c307eb2bf054bdce1cb9b11d966bc38f8c58f0d482276258e51e2bcd182faf3c8f3e754a134f8d3b3d2f364384d2ffeec870794aba168e8b5b74f1e6ce"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-64kb \
hdjmod-kmp-64kb-k6.4.12-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
