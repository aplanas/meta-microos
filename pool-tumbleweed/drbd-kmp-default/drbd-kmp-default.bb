SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.4.3_1"

RPM_NAME = "drbd-kmp-default-9.0.30~1+git.8e9c0812_k6.4.3_1-8.18.aarch64.rpm"
RPM_HASH = "c142a3c77df2de1aaa59f6414e3353d5d3ab3341397e85745e248858bdaaffed8e4838d525720617d5318d96434fa01e6974abd0b422f304052f1a63516ff909"

RPROVIDES:${PN} += "drbd-kmp \
drbd-kmp-default \
drbd-kmp-default-k6.4.3-1 \
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
