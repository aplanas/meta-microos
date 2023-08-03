SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.5"

RPM_NAME = "postgresql14-postgis-3.2.5-1.1.aarch64.rpm"
RPM_HASH = "4b03a24d0d4c827d10dd381b7fa43c3ea39b962177db65df4033f8658b1ac93b169c7846d71d3294afed73842970f53442080a59430c0e254ecdb603cb13587b"

RPROVIDES:${PN} += "postgis \
postgresql14-address-standardizer \
postgresql14-postgis \
postgresql14-postgis-llvmjit"

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
postgresql14-server \
proj \
update-alternatives"

inherit rpm
