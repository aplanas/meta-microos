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

RPM_NAME = "libfsext1-20230603-1.4.aarch64.rpm"
RPM_HASH = "07e3c36cd2b10d9537be999b932d43986214b9ed50a2eca4cdd6fd862142a118f1a218984e91d68d009eff21ecde5a631e4444983cab4f744cc12ecd813f8516"

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
