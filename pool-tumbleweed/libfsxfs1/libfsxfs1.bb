SUMMARY = "Library for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsxfs1-20220829-3.8.aarch64.rpm"
RPM_HASH = "5067be4f512df5aa56557baa885e43dccbf7a55784d819230221a816e6050b7d53924f930438684e1dffb985304821b13d1bd2f59db48566824e2ab2db9d6a10"

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
