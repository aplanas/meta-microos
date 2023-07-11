SUMMARY = "Library for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsxfs1-20220829-3.10.aarch64.rpm"
RPM_HASH = "6e987304dd3868fc57f09a1ebc487cdcc4556383084c0024351f053dda4973a7bac1796ade94f05071da2af756688548d791f8562affebd901e93c784eb8a122"

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
