SUMMARY = "Library for accessing the Common Log File System (CLFS)"
DESCRIPTION = "libfsclfs is a library to access the Common Log File System (CLFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libfsclfs1-20210417-3.6.aarch64.rpm"
RPM_HASH = "b7031f96e195b909a6a45590dd8e062bc4b93c65a1f67d56f42a0f9524b412035bc35632610f0617fc9526d1f1ba571b9cb591de630209b46323fa87474c1d74"

RPROVIDES:${PN} += "libfsclfs.so.1 \
libfsclfs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
