SUMMARY = "Library to access the Extended File System (ext)"
DESCRIPTION = "libfsext is a library to access the Extended File System (ext). \
 \
Read-only supported ext formats: \
 \
* ext2 (version 2) \
* ext3 (version 3) \
* ext4 (version 4) \
 \
Supported ext format features: \
 \
* ext4 inline data \
 \
Unsupported ext format features: \
 \
* ext (version 1) \
* compression \
* encryption"
LICENSE = "LGPL-3.0-or-later"

PV = "20230603"

RPM_NAME = "libfsext1-20230603-1.1.aarch64.rpm"
RPM_HASH = "eba52b52682ca9790db34f6090b2c9a9fe79c5f88a3ba597271f274a6f1af38bc6e2865c576d8f5a638c128b3e5d41da38a96a3568a508dca55ec3f2bde2cf39"

RPROVIDES:${PN} += "libfsext.so.1 \
libfsext1"

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
