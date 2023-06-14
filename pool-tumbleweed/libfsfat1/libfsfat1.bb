SUMMARY = "Library for accessing the FAT file system"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "libfsfat1-20220925-3.9.aarch64.rpm"
RPM_HASH = "263eed0c6a5c5f27d9c42ea9f5bc07450749fdad3c959a15e84815b32c478099dfccd3f6126b38bd2b207c76f5494636729a37b85dce56b6b54fd53f08fd07c3"

RPROVIDES:${PN} += "libfsfat.so.1 \
libfsfat1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libuna.so.1"

inherit rpm
