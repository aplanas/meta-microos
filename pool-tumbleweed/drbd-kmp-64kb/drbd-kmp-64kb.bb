SUMMARY = "Kernel driver"
DESCRIPTION = "This module is the kernel-dependent driver for DRBD. This is split out so \
that multiple kernel driver versions can be installed, one for each \
installed kernel."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812_k6.4.2_1"

RPM_NAME = "drbd-kmp-64kb-9.0.30~1+git.8e9c0812_k6.4.2_1-8.17.aarch64.rpm"
RPM_HASH = "b65a208350fff34fbced4816207e5aaf4df5a6fdd1158f7f4dcd021cb13f3382ae145793a5c509328aa3af44f03d85ed861f237b7405c6065bd1ed8109930706"

RPROVIDES:${PN} += "drbd-kmp \
drbd-kmp-64kb \
drbd-kmp-64kb-k6.4.2-1 \
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
