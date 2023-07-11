SUMMARY = "Library for accessing the Notes Storage Facility format"
DESCRIPTION = "libnsfdb is a library to access the Notes Storage Facility (NSF) \
database file format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210419"

RPM_NAME = "libnsfdb1-20210419-3.7.aarch64.rpm"
RPM_HASH = "40635a82c3439f47c38fb8f16d97e493762895134e58c3695b8142f0fde0090a3126708ac3cc8f81eea8d13419a557dd49b2873230d5f7ef72379c0913fc4be7"

RPROVIDES:${PN} += "libnsfdb.so.1 \
libnsfdb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1"

inherit rpm
