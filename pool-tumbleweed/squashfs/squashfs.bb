SUMMARY = "A Read-Only File System with Efficient Compression"
DESCRIPTION = "This package contains the userland utilities to create and read \
squashfs images."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "squashfs-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "5c6d39eb6b8138f404c56cf33438c6a28eabef1100ebcb2e5f315f81851f21c5f954cfcbc3143b9b7f904233b07a6102f3a9f01a382d9050c42b645533779568"

RPROVIDES:${PN} += "squashfs \
squashfs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblz4.so.1()(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
liblzo2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
