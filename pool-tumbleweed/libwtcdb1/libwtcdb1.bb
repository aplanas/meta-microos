SUMMARY = "Library for accessing Windows thumbnail cache databases"
DESCRIPTION = "libwtcdb is a library to access the Windows (Vista/7) Explorer \
thumbnail cache database (WTCDB) format (thumbcache.db). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libwtcdb1-20210417-3.3.aarch64.rpm"
RPM_HASH = "8616209863ec9b1705774a5d0c5dbcd6ee65ffc77138f0640d4d527fe838f9cf17daa5b1d4cecc331bbdb30d5e868bf489dc29faae6a384c806fe4a335f4d3d0"

RPROVIDES:${PN} += "libwtcdb.so.1()(64bit) \
libwtcdb.so.1(V_20210417)(64bit) \
libwtcdb1 \
libwtcdb1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit)"

inherit rpm
