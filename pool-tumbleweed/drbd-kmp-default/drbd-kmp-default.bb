SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.4.11_1"

RPM_NAME = "drbd-kmp-default-9.0.30~1+git.8e9c0812_k6.4.11_1-8.23.aarch64.rpm"
RPM_HASH = "98cd016efc503ef6d5869b3d13e1be5017e36e19781accbea651a0f660851b0e20d77391b90c2831ca38f8bc12b5db4f75c3806647f1cd112cc64fd266aa8664"

RPROVIDES:${PN} += "drbd-kmp \
drbd-kmp-default \
drbd-kmp-default-k6.4.11-1 \
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
