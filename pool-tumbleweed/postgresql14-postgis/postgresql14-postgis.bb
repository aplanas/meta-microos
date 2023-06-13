SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql14-postgis-3.2.4-1.6.aarch64.rpm"
RPM_HASH = "a223c931822426e2213c8a9a79c4902c494affc2e41fe398168f936d9f0b6e2c747d15c14e06ef9491f482ed5691b4769cf3047f92424a904a239d3d148ec2a4"

RPROVIDES:${PN} += "postgis \
postgresql14-address_standardizer \
postgresql14-postgis \
postgresql14-postgis(aarch-64) \
postgresql14-postgis-llvmjit"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libSFCGAL.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdal.so.32()(64bit) \
libgeos_c.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libjson-c.so.5()(64bit) \
libm.so.6()(64bit) \
libpcre2-8.so.0()(64bit) \
libpq.so.5()(64bit) \
libproj.so.25()(64bit) \
libprotobuf-c.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
postgresql14-server \
proj \
update-alternatives"

inherit rpm
