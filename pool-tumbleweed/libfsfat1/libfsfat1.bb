SUMMARY = "Library for accessing the FAT file system"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "libfsfat1-20220925-3.12.aarch64.rpm"
RPM_HASH = "0ec7fb678a6ac3ad700d8bb43c56714dc6eb4c142085954d5bd87dcfe3fa866f3947f6cfce13932b779bdd7a2508e98c94becede41952dc1bf7e790349491582"

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
