SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql13-postgis-3.2.4-1.6.aarch64.rpm"
RPM_HASH = "7a88923338a057b1b5d4a06759e16feb811c98f07e0418e9a45bc58479e6fab81375f224cbb68cd24e2b72565386ca993fd6f0f098e5ac511341bf10f9e69de3"

RPROVIDES:${PN} += "postgis \
postgresql13-address_standardizer \
postgresql13-postgis \
postgresql13-postgis(aarch-64) \
postgresql13-postgis-llvmjit"

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
postgresql13-server \
proj \
update-alternatives"

inherit rpm
