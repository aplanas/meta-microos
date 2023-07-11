SUMMARY = "Library to create F2 filesystems"
DESCRIPTION = "This package contains a shared library to format F2 filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.15.0"

RPM_NAME = "libf2fs_format8-1.15.0-2.4.aarch64.rpm"
RPM_HASH = "cf0674dbac5d92dfe1fc0d3142dcb527bca7d002584a5c5779c5782d3c592e8c73ec8472fbcdb9d091652d4e41d4edd0fa684318ccc01ffb8a02bf4a1fc39ac2"

RPROVIDES:${PN} += "libf2fs-format.so.8 \
libf2fs-format8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libf2fs.so.9 \
libuuid.so.1"

inherit rpm
