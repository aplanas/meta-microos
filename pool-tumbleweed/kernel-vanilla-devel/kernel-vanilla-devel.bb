SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the vanilla flavor of the kernel. \
 \
 \
Source Timestamp: 2023-05-29 06:22:29 +0000 \
GIT Revision: 2c66b1f470678d30f7dc560d1f3770e6e13b5e65 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-vanilla-devel-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "ad5ea5b32fccaa15a802e7a4ae151f4db7ee3dddb7e454e1ad7e7a831d0c0b2cc0d012c45f8eda4ab4045c9896ece27c22b35862403c6d4f52f513018b824a9e"

RPROVIDES:${PN} += "kernel-vanilla-devel \
kernel-vanilla-devel(aarch-64) \
multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
dwarves \
kernel-source-vanilla \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libelf.so.1(ELFUTILS_1.3)(64bit)"

inherit rpm
