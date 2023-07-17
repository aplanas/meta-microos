SUMMARY = "Library for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsxfs1-20220829-3.11.aarch64.rpm"
RPM_HASH = "7d81f0bc0695d011b176a1c6f7ebdd0be6e5ef663678a24bec4ef6e4691028b244d38443fefd265d0bf353a765b2fc99358f9eb4331c25d797e3892c63ef4f14"

RPROVIDES:${PN} += "libfsxfs.so.1 \
libfsxfs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfdata.so.1 \
libuna.so.1"

inherit rpm
