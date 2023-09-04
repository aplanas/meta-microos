SUMMARY = "Library for accessing Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi1-20221025-4.1.aarch64.rpm"
RPM_HASH = "1c7ab45e7cd9dff4ac6ff3010d67b2bf0a22fbd5733549c5112dfa271d6cb02cc25e2ebf44966954640a0eba138b27f440b83b21f6fafcd14d590796efdfd27a"

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
