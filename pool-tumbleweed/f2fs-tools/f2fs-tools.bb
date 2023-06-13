SUMMARY = "Utilities for the Flash-friendly Filesystem (F2FS)"
DESCRIPTION = "Utilities needed to create and maintain so-called Flash-Friendly (F2) \
filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.15.0"

RPM_NAME = "f2fs-tools-1.15.0-2.3.aarch64.rpm"
RPM_HASH = "8713d7911be1ad944daefdcdec055b37f6f98c972928a897b1c3317063ba8e3f6525ec69b7490dbf09b2954a13c103eba2eb183cce7d15ff5b9c9d4762d5bb93"

RPROVIDES:${PN} += "f2fs-tools \
f2fs-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_2.15)(64bit) \
libblkid.so.1(BLKID_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libf2fs.so.9()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
