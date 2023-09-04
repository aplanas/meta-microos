SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.4.11_1"

RPM_NAME = "drbd-kmp-64kb-9.0.30~1+git.8e9c0812_k6.4.11_1-8.23.aarch64.rpm"
RPM_HASH = "f8b3d400f5640515e5b067969d911380245de17ce7afb3227e695191614e124c87e9917be76131ef325f6dacfe2c6cb53dfecbf9c8e38a638e66c087f61c73c4"

RPROVIDES:${PN} += "drbd-kmp \
drbd-kmp-64kb \
drbd-kmp-64kb-k6.4.11-1 \
kmod-drbd-transport-tcp.ko \
kmod-drbd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
