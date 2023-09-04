SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.4.11_1"

RPM_NAME = "hdjmod-kmp-64kb-1.34_k6.4.11_1-1.17.aarch64.rpm"
RPM_HASH = "c73c979f637efd60833b4b728e783ac6f868b6df8d1ae8ebdb9764d15deedc8b1a3381777ea5d1c2a90e17f157f9c8924bca5ddfd34834cab76a570f09b87524"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-64kb \
hdjmod-kmp-64kb-k6.4.11-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
