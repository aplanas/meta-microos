SUMMARY = "Library for accessing Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi1-20221025-3.8.aarch64.rpm"
RPM_HASH = "dd3e4eab1fef965b7a356b91cb0b87fc21223db37bb1f747cf1fa651314054f7779cfddd00d4cc99d061ba17f70da5ce5df93f8654cf09abd4b0e8f8404f8a83"

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
