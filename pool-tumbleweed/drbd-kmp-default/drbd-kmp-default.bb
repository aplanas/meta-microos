SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.3.4_1"

RPM_NAME = "drbd-kmp-default-9.0.30~1+git.8e9c0812_k6.3.4_1-8.12.aarch64.rpm"
RPM_HASH = "dba4426d515d46cfbded911765c2a3f5695648a6177471366cad0257a008e2fcb07b839b963356b7eeb504030b4e97730197fb71f3cfefa2bd42335af3bd3ca4"

RPROVIDES:${PN} += "drbd-kmp \
drbd-kmp-default \
drbd-kmp-default-k6.3.4-1 \
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
