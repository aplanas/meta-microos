SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.4.2_1"

RPM_NAME = "hdjmod-kmp-default-1.34_k6.4.2_1-1.11.aarch64.rpm"
RPM_HASH = "95894810f6f4bd30435407a2ea93ffe784ae4f2f95ad51ec60949b94abee05cc83795cfd278d25fb2beb252e5c1ae31f879b5b26f8f1b2f69a03f4ef7f896a8b"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-default \
hdjmod-kmp-default-k6.4.2-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
