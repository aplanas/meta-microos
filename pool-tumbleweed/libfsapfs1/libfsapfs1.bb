SUMMARY = "Library for access the Apple File System (APFS)"
DESCRIPTION = "libfsapfs1 is a library for access the Apple File System (APFS)."
LICENSE = "LGPL-3.0-only"

PV = "20221102"

RPM_NAME = "libfsapfs1-20221102-3.11.aarch64.rpm"
RPM_HASH = "de7133572d38812015f3cbe9eceb337bf32691fd9b904c6a17c2ea574b37ccfc84a8851dc33a48c8855c623a6ca68a9cde0bb1c41e4dcfd3b774f2b22ff04bb2"

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
