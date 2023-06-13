SUMMARY = "Library to create F2 filesystems"
DESCRIPTION = "This package contains a shared library to format F2 filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.15.0"

RPM_NAME = "libf2fs_format8-1.15.0-2.3.aarch64.rpm"
RPM_HASH = "fe3b99a8f97d0f15ead0b456a944a7dd08e8f386ca1586c120bed4d378a03965a695eca8bd5b60912e242649b5468e8f7a913ca0cee10a302945648bf8320a38"

RPROVIDES:${PN} += "libf2fs_format.so.8()(64bit) \
libf2fs_format8 \
libf2fs_format8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_2.15)(64bit) \
libblkid.so.1(BLKID_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libf2fs.so.9()(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
