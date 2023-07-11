SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "postgresql12-pgsql-ogr-fdw-1.1.0-4.4.aarch64.rpm"
RPM_HASH = "873b7e0a9640efa3201dd4731527836d2120a9693675177d43b402052e999f99d067e630303b52cb74d9380d3501f49944c139e48d090e3ce8d782e28aae75b0"

RPROVIDES:${PN} += "postgresql12-pgsql-ogr-fdw"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.32 \
postgresql12-server"

inherit rpm
