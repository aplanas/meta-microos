SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.4.2_1"

RPM_NAME = "hdjmod-kmp-64kb-1.34_k6.4.2_1-1.11.aarch64.rpm"
RPM_HASH = "aeccc60c173ab2725501e2967c4034d7ca7f8347139417b62799c78c6012f58df6c5e71c2c484d8a1ab142394d724787d302c3845116a830122cab0649714f11"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-64kb \
hdjmod-kmp-64kb-k6.4.2-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
