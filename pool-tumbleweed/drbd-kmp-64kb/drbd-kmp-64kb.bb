SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.3.4_1"

RPM_NAME = "drbd-kmp-64kb-9.0.30~1+git.8e9c0812_k6.3.4_1-8.12.aarch64.rpm"
RPM_HASH = "2091d0c9222299d988095626b082be6aa9db85f97b02f66ab7836cdb10d6aba4713608e241142a88486a8cebc32fe85fc4f1b03de7b9f3d4cb7f0551ea4fb7d2"

RPROVIDES:${PN} += "drbd-kmp \
drbd-kmp-64kb \
drbd-kmp-64kb(aarch-64) \
drbd-kmp-64kb-k6.3.4_1 \
kmod(drbd.ko) \
kmod(drbd_transport_tcp.ko) \
multiversion(kernel)"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
