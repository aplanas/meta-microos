SUMMARY = "Library for accessing Windows thumbnail cache databases"
DESCRIPTION = "libwtcdb is a library to access the Windows (Vista/7) Explorer \
thumbnail cache database (WTCDB) format (thumbcache.db). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libwtcdb1-20210417-3.3.aarch64.rpm"
RPM_HASH = "8616209863ec9b1705774a5d0c5dbcd6ee65ffc77138f0640d4d527fe838f9cf17daa5b1d4cecc331bbdb30d5e868bf489dc29faae6a384c806fe4a335f4d3d0"

RPROVIDES:${PN} += "libwtcdb.so.1 \
libwtcdb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1"

inherit rpm
