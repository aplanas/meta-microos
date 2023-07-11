SUMMARY = "Spatial SQLite"
DESCRIPTION = "The SpatiaLite extension enables SQLite to support spatial data too \
[aka GEOMETRY], in a way conformant to OpenGis specifications."
LICENSE = "MPL-1.1"

PV = "5.0.1"

RPM_NAME = "libspatialite7-5.0.1-2.11.aarch64.rpm"
RPM_HASH = "a56256c5b4f8e3e133cea196f3c389ec7ad6e91cc0a87fd60ead99c86d39b01c2511e1d63d213d7e930f0aa92a7fcef15e6d99165817b535a4c557a4e81e0b07"

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
