SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.1.16_k6.4.12_1"

RPM_NAME = "drbd-kmp-64kb-9.1.16_k6.4.12_1-1.1.aarch64.rpm"
RPM_HASH = "18e3534a5bab6f8e042859ed0a6ee2895826b90430f2d907c7fc013a83029f8583b374ed7a0709266363efdd374ba5fc69891bfcb223c363247311a64ce19053"

RPROVIDES:${PN} += "drbd-kmp \
drbd-kmp-64kb \
drbd-kmp-64kb-k6.4.12-1 \
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
