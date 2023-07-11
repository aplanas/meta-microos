SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql13-postgis-3.2.4-1.8.aarch64.rpm"
RPM_HASH = "c4053988500e980e6850eebb7f12a01d9f79c596e8e37d70320ac9576d10ea97b17fd48b2100e80d0ce3f922a6710d4bf0112a4e78e930bb7b93a7228fc31849"

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
