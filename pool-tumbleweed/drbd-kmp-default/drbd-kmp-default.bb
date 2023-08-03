SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.4.6_1"

RPM_NAME = "drbd-kmp-default-9.0.30~1+git.8e9c0812_k6.4.6_1-8.20.aarch64.rpm"
RPM_HASH = "395360a41b5d35bbf9d0dfc8d202a00f638a382cfe13dcb95e3d8effede74e773b138aa0d17d2e3f6f99a96673d5c54911ad35a937bd2b480ac5d3caa81dbbd4"

RPROVIDES:${PN} += "drbd-kmp \
drbd-kmp-default \
drbd-kmp-default-k6.4.6-1 \
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
