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

RPM_NAME = "libfsext1-20230603-2.1.aarch64.rpm"
RPM_HASH = "7809b9edbb3f254d563944d05c80843ecdd62962c7d17be7a62e2b9b0730b0274949ba7e0c1e44b757a9eb221ca7281b663c40aead1ccee29a911337e8ececfd"

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
