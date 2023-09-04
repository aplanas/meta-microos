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

RPM_NAME = "kmod-30-8.1.aarch64.rpm"
RPM_HASH = "523c09c69c1d319cbd54583c0607ecf78e7b3f7395fccc7b06679b4581386e1ad61418e3ac97726d0ab0cf6fc3ef29ba4d624067e706115b63b5fc9b6814faa1"

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
