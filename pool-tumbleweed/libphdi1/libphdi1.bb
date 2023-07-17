SUMMARY = "Library for accessing Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi1-20221025-3.12.aarch64.rpm"
RPM_HASH = "2378e19d3891d7901d8662c88f1ef8c05ed9aceb12c039c38a0b3b21c68fe69b1f8370b55ed601920c50798ad5432d27b98d7fd17b0d1afea26a9b2689073b97"

RPROVIDES:${PN} += "libphdi.so.1 \
libphdi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcdirectory.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfguid.so.1 \
libfvalue.so.1 \
libuna.so.1"

inherit rpm
