SUMMARY = "Library for access the Apple File System (APFS)"
DESCRIPTION = "libfsapfs1 is a library for access the Apple File System (APFS)."
LICENSE = "LGPL-3.0-only"

PV = "20230617"

RPM_NAME = "libfsapfs1-20230617-2.1.aarch64.rpm"
RPM_HASH = "c095436f6f79f953c57a7fcaa3b8697466f37334eb121b5590cf1cd7faa13069575688b97678a2ae4d30c46499d160799acbe766c28d4d02de24d8814acb275b"

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
