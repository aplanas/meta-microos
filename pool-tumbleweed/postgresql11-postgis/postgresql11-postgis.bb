SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.4"

RPM_NAME = "postgresql11-postgis-3.3.4-1.2.aarch64.rpm"
RPM_HASH = "c4709949902f2120e1e82cf019642f08bcc3e81650d4d4fbb302bb8d5b3762e01e37a6c38c720d77ccbea09a8feb0d9c397dbce1c526f544b02c5e9646cd5dbb"

RPROVIDES:${PN} += "postgis \
postgresql11-address-standardizer \
postgresql11-postgis \
postgresql11-postgis-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSFCGAL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.32 \
libgeos-c.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjson-c.so.5 \
libm.so.6 \
libpcre2-8.so.0 \
libpq.so.5 \
libproj.so.25 \
libprotobuf-c.so.1 \
libstdc++.so.6 \
libxml2.so.2 \
postgresql11-server \
proj \
update-alternatives"

inherit rpm
