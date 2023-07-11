SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.3.9_1"

RPM_NAME = "hdjmod-kmp-default-1.34_k6.3.9_1-1.10.aarch64.rpm"
RPM_HASH = "3b04af62831d0f491ab0a7154cbc134b29de0c63cdbe7827cfde510d007a24e26ffbfa8b6979afead61b986070d0bebc345e0a5e0e58871a66f4bda4a278b200"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-default \
hdjmod-kmp-default-k6.3.9-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
