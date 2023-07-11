SUMMARY = "Library for accessing Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi1-20221025-3.11.aarch64.rpm"
RPM_HASH = "0cb7ac27e1bca5b6b2f8da69d8b59657df5c8f8554bd66360f33a6482be611f29d87cfb44d5ef41799f9052779fb207633fe20d6fe76e6b1a55c76da651dafc3"

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
