SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql13-postgis-3.2.4-1.6.aarch64.rpm"
RPM_HASH = "7a88923338a057b1b5d4a06759e16feb811c98f07e0418e9a45bc58479e6fab81375f224cbb68cd24e2b72565386ca993fd6f0f098e5ac511341bf10f9e69de3"

RPROVIDES:${PN} += "postgis \
postgresql13-address-standardizer \
postgresql13-postgis \
postgresql13-postgis-llvmjit"

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
postgresql13-server \
proj \
update-alternatives"

inherit rpm
