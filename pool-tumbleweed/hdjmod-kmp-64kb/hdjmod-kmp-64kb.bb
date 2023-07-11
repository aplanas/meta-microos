SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.3.9_1"

RPM_NAME = "hdjmod-kmp-64kb-1.34_k6.3.9_1-1.10.aarch64.rpm"
RPM_HASH = "4fe7587187e14be5ee36425b518c7c341b6a9a2a58d01780b6449ec72af3d19cdf0e212bdabca3214479c2ca7398a9e4572ee916d13880a3a0d5acb384207ee6"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-64kb \
hdjmod-kmp-64kb-k6.3.9-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
