SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.4.11_1"

RPM_NAME = "hdjmod-kmp-default-1.34_k6.4.11_1-1.17.aarch64.rpm"
RPM_HASH = "2ad267be2f4d26bb385cb6352d6a0ff7540b18581915001f34a4316cdb6349d3b53337dd1321957220327d4c51654f7adc0bf41126c382b15abb2a8e1b77c0bf"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-default \
hdjmod-kmp-default-k6.4.11-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
