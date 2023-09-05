SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.4.12_1"

RPM_NAME = "drbd-kmp-default-9.0.30~1+git.8e9c0812_k6.4.12_1-8.24.aarch64.rpm"
RPM_HASH = "ce98a79c49e3f3818a574c3c288a691f319e0c49c306a6bb55bda585dfb1080a424b83f81242a5d70aebe272d0391ad1ba57cbd4746ab17742735465e2451da6"

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
