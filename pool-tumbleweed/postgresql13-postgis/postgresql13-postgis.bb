SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.5"

RPM_NAME = "postgresql13-postgis-3.2.5-1.1.aarch64.rpm"
RPM_HASH = "b94cb365928bc84f77f5eb832c15d28fe0d86e6c13cd1a7e98e2a784a7d6ad42c6e94129ab0e9fe0e6ced22517b8fe58f6a927fb42bc5ba704b8f30e7df4d5a9"

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
