SUMMARY = "Spatial SQLite"
DESCRIPTION = "The SpatiaLite extension enables SQLite to support spatial data too \
[aka GEOMETRY], in a way conformant to OpenGis specifications."
LICENSE = "MPL-1.1"

PV = "5.0.1"

RPM_NAME = "libspatialite7-5.0.1-2.10.aarch64.rpm"
RPM_HASH = "948ca1ef4d6ab966d967f391b80b8dc647ba546da049aae0f81a6dc2134aea643833da87e08d5db553a9d37de2e0c91c2ddb0d39841041c6370ff0573caf8b33"

RPROVIDES:${PN} += "libspatialite.so.7 \
libspatialite7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreexl.so.1 \
libgeos-c.so.1 \
libm.so.6 \
libminizip.so.1 \
libproj.so.25 \
librttopo.so.1 \
libsqlite3.so.0 \
libxml2.so.2 \
libz.so.1"

inherit rpm
