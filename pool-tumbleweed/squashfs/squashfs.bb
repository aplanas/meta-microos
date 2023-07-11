SUMMARY = "A Read-Only File System with Efficient Compression"
DESCRIPTION = "This package contains the userland utilities to create and read \
squashfs images."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "squashfs-4.6.1-2.1.aarch64.rpm"
RPM_HASH = "af786716ee9ff768759d76c2d19dda0565c5a22744dd9d4257faf4036e38edbcea8ef2ca492c03d9a7747a72874f99fd3e75e54a98dff55c3dac6cfe9f882747"

RPROVIDES:${PN} += "squashfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
liblzma.so.5 \
liblzo2.so.2 \
libm.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
