SUMMARY = "Library for accessing the Notes Storage Facility format"
DESCRIPTION = "libnsfdb is a library to access the Notes Storage Facility (NSF) \
database file format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210419"

RPM_NAME = "libnsfdb1-20210419-3.8.aarch64.rpm"
RPM_HASH = "d12f9d5da7231d1008442b1b7866066fbd0a751ddb17aed7620c385b9b5c53f8a0d561240fb1dcbe70639ea8506ad67e267e7c51115b7feb0f6d6b2ab9d4c577"

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
