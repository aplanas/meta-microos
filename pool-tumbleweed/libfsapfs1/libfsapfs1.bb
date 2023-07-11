SUMMARY = "Library for access the Apple File System (APFS)"
DESCRIPTION = "libfsapfs1 is a library for access the Apple File System (APFS)."
LICENSE = "LGPL-3.0-only"

PV = "20230617"

RPM_NAME = "libfsapfs1-20230617-1.3.aarch64.rpm"
RPM_HASH = "78fe4bae8f854eaa178969171835b46151f1a2f82c3eac0e8a2dedb43b4d064770930928443e4b876631b03adbcb548402a4eacbd2e5df86733d70745c21ed96"

RPROVIDES:${PN} += "libfsapfs.so.1 \
libfsapfs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcaes.so.1 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfmos.so.1 \
libhmac.so.1 \
libuna.so.1 \
libz.so.1"

inherit rpm
