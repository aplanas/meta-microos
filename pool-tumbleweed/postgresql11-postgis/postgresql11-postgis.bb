SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql11-postgis-3.2.4-1.6.aarch64.rpm"
RPM_HASH = "9593cfbca9d54895b811b9a929d94cb2d0f93a66b66ec972028a4dca7f866c5fe4a503139ecb49e53ea9025cf3337df7a31689f2f19720eca1063ba5b3148f9d"

RPROVIDES:${PN} += "postgis \
postgresql11-address_standardizer \
postgresql11-postgis \
postgresql11-postgis(aarch-64) \
postgresql11-postgis-llvmjit"

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
postgresql11-server \
proj \
update-alternatives"

inherit rpm
