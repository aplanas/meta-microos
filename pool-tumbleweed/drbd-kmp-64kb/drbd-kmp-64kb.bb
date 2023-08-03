SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.4.6_1"

RPM_NAME = "drbd-kmp-64kb-9.0.30~1+git.8e9c0812_k6.4.6_1-8.20.aarch64.rpm"
RPM_HASH = "c60a20019c2bcd6955c8fdc00ba66b1bd0bcf1328b28048f429cf2f08545cfc6739c10e9ff0a08f71353dcc19753d41615f3334c54348864655b9f4671f21e64"

RPROVIDES:${PN} += "drbd-kmp \
drbd-kmp-64kb \
drbd-kmp-64kb-k6.4.6-1 \
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
