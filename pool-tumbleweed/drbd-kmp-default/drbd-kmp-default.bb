SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.4.2_1"

RPM_NAME = "drbd-kmp-default-9.0.30~1+git.8e9c0812_k6.4.2_1-8.17.aarch64.rpm"
RPM_HASH = "a09a825f2a03e790bed5b7026e559353316262636408be77878dba51c671665dbf03a2ad64d352f69094b724c2d987b4549d002756b59344c212c8387f4f74bb"

RPROVIDES:${PN} += "drbd-kmp \
drbd-kmp-default \
drbd-kmp-default-k6.4.2-1 \
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
