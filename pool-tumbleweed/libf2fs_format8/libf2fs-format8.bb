SUMMARY = "Library to create F2 filesystems"
DESCRIPTION = "This package contains a shared library to format F2 filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.15.0"

RPM_NAME = "libf2fs_format8-1.15.0-2.3.aarch64.rpm"
RPM_HASH = "fe3b99a8f97d0f15ead0b456a944a7dd08e8f386ca1586c120bed4d378a03965a695eca8bd5b60912e242649b5468e8f7a913ca0cee10a302945648bf8320a38"

RPROVIDES:${PN} += "libf2fs-format.so.8 \
libf2fs-format8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libf2fs.so.9 \
libuuid.so.1"

inherit rpm
