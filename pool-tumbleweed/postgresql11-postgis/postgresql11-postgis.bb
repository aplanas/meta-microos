SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql11-postgis-3.2.4-1.8.aarch64.rpm"
RPM_HASH = "b1d9a1e8e1d648c139f29b69a1d789156b0818adaee128977bd324262d88db826cdc53b184ee0aba8096dca511c6179d1d5b5ab493b8979f89ebed9ff3f251b8"

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
