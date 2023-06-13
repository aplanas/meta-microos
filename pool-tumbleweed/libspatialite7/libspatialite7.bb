SUMMARY = "Spatial SQLite"
DESCRIPTION = "The SpatiaLite extension enables SQLite to support spatial data too \
[aka GEOMETRY], in a way conformant to OpenGis specifications."
LICENSE = "MPL-1.1"

PV = "5.0.1"

RPM_NAME = "libspatialite7-5.0.1-2.10.aarch64.rpm"
RPM_HASH = "948ca1ef4d6ab966d967f391b80b8dc647ba546da049aae0f81a6dc2134aea643833da87e08d5db553a9d37de2e0c91c2ddb0d39841041c6370ff0573caf8b33"

RPROVIDES:${PN} += "libspatialite.so.7()(64bit) \
libspatialite7 \
libspatialite7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfreexl.so.1()(64bit) \
libgeos_c.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libminizip.so.1()(64bit) \
libproj.so.25()(64bit) \
librttopo.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.8)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.2)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
