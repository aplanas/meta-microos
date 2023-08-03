SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.4.6_1"

RPM_NAME = "hdjmod-kmp-64kb-1.34_k6.4.6_1-1.14.aarch64.rpm"
RPM_HASH = "64dc094639af506f6f33d7850753ea9e05ac9a80a7403cf7aae6475379f3282b874268ab32c54e39a8504eef8dd6a6cdf9c983ab2476e16033bed3a218d205f1"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-64kb \
hdjmod-kmp-64kb-k6.4.6-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
