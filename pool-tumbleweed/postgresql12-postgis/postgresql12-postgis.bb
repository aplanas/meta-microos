SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.4"

RPM_NAME = "postgresql12-postgis-3.3.4-1.2.aarch64.rpm"
RPM_HASH = "cc84e958a0b8378a28d543450b2ce3fc19b3efb45a1c9057de6516d02c00867ddf2c695074a22893c3caaabc1d1cbffee2efd0b1d50483eaae729527fd3740b3"

RPROVIDES:${PN} += "postgis \
postgresql12-address-standardizer \
postgresql12-postgis \
postgresql12-postgis-llvmjit"

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
postgresql12-server \
proj \
update-alternatives"

inherit rpm
