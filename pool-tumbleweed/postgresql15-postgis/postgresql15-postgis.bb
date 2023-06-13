SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql15-postgis-3.2.4-1.6.aarch64.rpm"
RPM_HASH = "95b82bfb18075700ae1e4edc1ef3076cc9be50b55f60d6c8dff1b6a2d065feef7ec7afe11a95bb9413cb29509695411c852e91fc7109286bb04d587e9fc9b57d"

RPROVIDES:${PN} += "postgis \
postgresql15-address_standardizer \
postgresql15-postgis \
postgresql15-postgis(aarch-64) \
postgresql15-postgis-llvmjit"

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
postgresql15-server \
proj \
update-alternatives"

inherit rpm
