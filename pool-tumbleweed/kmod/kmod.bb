SUMMARY = "Utilities to load modules into the kernel"
DESCRIPTION = "kmod is a set of tools to handle common tasks with Linux kernel \
modules like insert, remove, list, check properties, resolve \
dependencies and aliases. \
 \
These tools are designed on top of libkmod, a library that is shipped \
with kmod. The aim is to be compatible with tools, configurations and \
indexes from module-init-tools project."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "kmod-30-7.1.aarch64.rpm"
RPM_HASH = "9cf7575d4df0d5fc16971fbaa43e5f377c1eff777ae3ddffef1229410935ee99c328f8bfb79b36591c374e9dcb4bc9bd175def8cbc56d65c5b8087e8942f37af"

RPROVIDES:${PN} += "/sbin/modprobe \
kmod \
kmod-compat \
kmod-zstd \
module-init-tools \
modutils \
pkgconfig-kmod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzma.so.5 \
libz.so.1 \
libzstd.so.1 \
suse-module-tools"

inherit rpm
