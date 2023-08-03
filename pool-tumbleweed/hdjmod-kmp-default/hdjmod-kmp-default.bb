SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.4.6_1"

RPM_NAME = "hdjmod-kmp-default-1.34_k6.4.6_1-1.14.aarch64.rpm"
RPM_HASH = "84fe0698a5cc0fb9ff2bb636d899ea814ce40b9ac3cb6a3db3de6d67bc088b4316df2f4332f377d7ae149455e02b2e41078e84e07032705f03865db7832f5cd9"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-default \
hdjmod-kmp-default-k6.4.6-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
