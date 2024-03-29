SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.4"

RPM_NAME = "postgresql15-postgis-3.3.4-1.2.aarch64.rpm"
RPM_HASH = "0f35306211099a5e61e59944f93b09746bdff375e491ab5f77f6d93514f780efc44d38355b3bcd6305060c48283fb90f7614f6c10adcdf1892bb392e8a1fa72b"

RPROVIDES:${PN} += "postgis \
postgresql15-address-standardizer \
postgresql15-postgis \
postgresql15-postgis-llvmjit"

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
postgresql15-server \
proj \
update-alternatives"

inherit rpm
