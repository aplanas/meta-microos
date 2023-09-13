SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.1.16_k6.4.12_1"

RPM_NAME = "drbd-kmp-default-9.1.16_k6.4.12_1-1.1.aarch64.rpm"
RPM_HASH = "b86661be01abc140be88a50700ebd7a5832d86bef8f14a4dd39bf9905c273434fb7770ee2bc047e2bc86ba753313cf91533839e44b6c6b39037037c652c94dd8"

RPROVIDES:${PN} += "drbd-kmp \
drbd-kmp-default \
drbd-kmp-default-k6.4.12-1 \
kmod-drbd-transport-tcp.ko \
kmod-drbd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
