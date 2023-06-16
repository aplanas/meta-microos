SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql14-postgis-3.2.4-1.6.aarch64.rpm"
RPM_HASH = "a223c931822426e2213c8a9a79c4902c494affc2e41fe398168f936d9f0b6e2c747d15c14e06ef9491f482ed5691b4769cf3047f92424a904a239d3d148ec2a4"

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
