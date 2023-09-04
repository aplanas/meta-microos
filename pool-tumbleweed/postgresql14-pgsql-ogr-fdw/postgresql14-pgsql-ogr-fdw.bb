SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "postgresql14-pgsql-ogr-fdw-1.1.4-2.1.aarch64.rpm"
RPM_HASH = "a8707978d180452110ba66dbef3cb6e3375d6db92dace1e9e677ba36e7734d26e2a386b690e75c7960bd16c519dc1e157ea36d2f86b2daaa3ea470dfbdbae3c8"

RPROVIDES:${PN} += "postgresql14-pgsql-ogr-fdw \
postgresql14-pgsql-ogr-fdw-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.32 \
postgresql14-server"

inherit rpm
