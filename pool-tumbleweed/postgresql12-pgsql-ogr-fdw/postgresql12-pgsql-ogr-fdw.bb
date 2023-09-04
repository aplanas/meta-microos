SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "postgresql12-pgsql-ogr-fdw-1.1.4-2.1.aarch64.rpm"
RPM_HASH = "f64d3f0e75e6589e46d1ac4f0f5033dc7c86e7a64ea123b0127c2f6cbb18b185ccee5305464bc3280b5941b37e16ead43cf61b0d8b56503ddeab6397a2ec1e26"

RPROVIDES:${PN} += "postgresql12-pgsql-ogr-fdw \
postgresql12-pgsql-ogr-fdw-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.32 \
postgresql12-server"

inherit rpm
