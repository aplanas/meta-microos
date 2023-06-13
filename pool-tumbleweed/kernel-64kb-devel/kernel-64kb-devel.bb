SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the 64kb flavor of the kernel. \
 \
 \
Source Timestamp: 2023-05-29 06:22:29 +0000 \
GIT Revision: 2c66b1f470678d30f7dc560d1f3770e6e13b5e65 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-64kb-devel-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "704c5a97c9a78772b934490cfd4305444727cb703244fa0704effe048220b525cb84138a5efcb5fd91be1f3f2064faee3c2ffcb8cba5f81d5a4179d544263f44"

RPROVIDES:${PN} += "kernel-64kb-devel \
kernel-64kb-devel(aarch-64) \
multiversion(kernel)"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
dwarves \
kernel-devel \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libelf-devel \
libelf.so.1()(64bit)"

inherit rpm
