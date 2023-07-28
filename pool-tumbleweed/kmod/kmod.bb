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

RPM_NAME = "kmod-30-6.1.aarch64.rpm"
RPM_HASH = "afff48a0dee676f4163fb45ec136d855b25ccb46e87201c687e00cc55607d36a747a7a5ea0a2a9a49a4cd40f741954d1ca1eedec2dc0dae43c95079e755f399b"

RPROVIDES:${PN} += "/sbin/modprobe \
kmod \
kmod-compat \
kmod-zstd \
module-init-tools \
modutils"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzma.so.5 \
libz.so.1 \
libzstd.so.1 \
suse-module-tools"

inherit rpm
