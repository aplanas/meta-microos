SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql12-postgis-3.2.4-1.6.aarch64.rpm"
RPM_HASH = "82ee08ee758ea6d1f49a303237c3802e571b9a73aea21b13943b4cec16c7a5f98159b4d715aae87deb308cff5b2c082eb7eb2235b9afe1bee380989399d20f13"

RPROVIDES:${PN} += "postgis \
postgresql12-address_standardizer \
postgresql12-postgis \
postgresql12-postgis(aarch-64) \
postgresql12-postgis-llvmjit"

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
postgresql12-server \
proj \
update-alternatives"

inherit rpm
