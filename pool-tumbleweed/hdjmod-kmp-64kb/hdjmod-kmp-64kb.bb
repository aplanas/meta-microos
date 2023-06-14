SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.3.4_1"

RPM_NAME = "hdjmod-kmp-64kb-1.34_k6.3.4_1-1.4.aarch64.rpm"
RPM_HASH = "a20260677e456691165168dcb5ed3d3d3c9e9a1e7babadc0d9c724682306e7aa36f928aa1aa8ea0ae37fe9211467e27ffc4ff9944f8e78759bc3f319fa81ad17"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-64kb \
hdjmod-kmp-64kb-k6.3.4-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
