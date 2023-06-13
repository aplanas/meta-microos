SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the default flavor of the kernel. \
 \
 \
Source Timestamp: 2023-05-29 06:22:29 +0000 \
GIT Revision: 2c66b1f470678d30f7dc560d1f3770e6e13b5e65 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-default-devel-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "7b389716a7d58bed515542cf4e65b2bdfad7ebe3c72ecd8ddf8b4c0896a66171e65c800e534860b3adb012405414649839fbbb4795871fa620aa9a178a237252"

RPROVIDES:${PN} += "kernel-default-devel \
kernel-default-devel(aarch-64) \
multiversion(kernel)"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
dwarves \
kernel-devel \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libelf-devel \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libelf.so.1(ELFUTILS_1.3)(64bit)"

inherit rpm
