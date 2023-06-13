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

RPM_NAME = "kmod-30-3.1.aarch64.rpm"
RPM_HASH = "0edc1d2c368d1b6d867fbac2db043ecf2a6d1059b3740989c77b4cebde3f1125b5985905cc75a31dde294652011af464381e7fefad7c6e27cbf82b6e0ecb3922"

RPROVIDES:${PN} += "/sbin/modprobe \
kmod \
kmod(aarch-64) \
kmod-compat \
kmod-zstd \
module-init-tools \
modutils"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
suse-module-tools"

inherit rpm
