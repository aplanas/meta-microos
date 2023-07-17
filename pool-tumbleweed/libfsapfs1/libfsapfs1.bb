SUMMARY = "Library for access the Apple File System (APFS)"
DESCRIPTION = "libfsapfs1 is a library for access the Apple File System (APFS)."
LICENSE = "LGPL-3.0-only"

PV = "20230617"

RPM_NAME = "libfsapfs1-20230617-1.4.aarch64.rpm"
RPM_HASH = "cc5f2106ee08fe1054fd7e125f3e649ba85803713fbfcd1bdd48d0fb765b60d86f844841507a9ea9ea042432137562f87e4bb54f5d1ee330e144b0940a76506b"

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
