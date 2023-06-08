SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.3.1_1"

RPM_NAME = "drbd-kmp-64kb-9.0.30~1+git.8e9c0812_k6.3.1_1-8.9.aarch64.rpm"
RPM_HASH = "619b515b2bdb3802ca9c87be9eee4ea3088a63ea20e1d3fd843a3ceddf98800a347a7a4e03b0be51ee84b6d4e43ec24bd9adafadd58716d959149e26631be9e4"

RPROVIDES:${PN} += "drbd-kmp drbd-kmp-64kb drbd-kmp-64kb(aarch-64) drbd-kmp-64kb-k6.3.1_1 kmod(drbd.ko) kmod(drbd_transport_tcp.ko) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-64kb kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
