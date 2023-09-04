SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "postgresql13-pgsql-ogr-fdw-1.1.4-2.1.aarch64.rpm"
RPM_HASH = "1ff36453eb9b3b555e51be45862d3d488e564d2aca38a5bb1be3052a04cadcecb17682365869033af3b5bee045bf15cf9ae44bf26555ad37aaa35ba9f9b9cf01"

RPROVIDES:${PN} += "postgresql13-pgsql-ogr-fdw \
postgresql13-pgsql-ogr-fdw-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.32 \
postgresql13-server"

inherit rpm
