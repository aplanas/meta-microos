SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.3.1_1"

RPM_NAME = "drbd-kmp-default-9.0.30~1+git.8e9c0812_k6.3.1_1-8.9.aarch64.rpm"
RPM_HASH = "8c4a17a90860c72cff0ede504036cefa76399603d61b9b537145c289d6b02141af0d212e5c0359a75804f5d446ab1b1fd8834b1239cea651c1a666515ef6e699"

RPROVIDES:${PN} += "drbd-kmp drbd-kmp-default drbd-kmp-default(aarch-64) drbd-kmp-default-k6.3.1_1 kmod(drbd.ko) kmod(drbd_transport_tcp.ko) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-default kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
