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

RPM_NAME = "kmod-30-5.1.aarch64.rpm"
RPM_HASH = "630170a0de6c4159daed0a6467089005cb7d46e03dc7a9eb2ad453b8d564a95c5ebbb2ce62f157b6f290fd0ef428e1fc4debbb41f9ca3ffeabd97d4986eae44f"

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
