SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.3.9_1"

RPM_NAME = "drbd-kmp-default-9.0.30~1+git.8e9c0812_k6.3.9_1-8.16.aarch64.rpm"
RPM_HASH = "7fb26fbef18fe41bdd251239b9656dda237f6e81ae240a2afdbffb86b4c0b72b005eb577703ff42d20855b46854d6c92933963d0caaa92e2b3fd410a82fe8f5e"

RPROVIDES:${PN} += "drbd-kmp \
drbd-kmp-default \
drbd-kmp-default-k6.3.9-1 \
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
