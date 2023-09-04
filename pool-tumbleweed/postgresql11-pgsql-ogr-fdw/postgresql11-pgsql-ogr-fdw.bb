SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "postgresql11-pgsql-ogr-fdw-1.1.4-2.1.aarch64.rpm"
RPM_HASH = "e7ca70d319ac9eade5fb257a993fb479f7f95a07d8d7c19deff532b7e3583c165b29977f262d8fccf6fa26a151fdb1a8f6a7f1201dea234dce4bbb1316aa65b8"

RPROVIDES:${PN} += "postgresql11-pgsql-ogr-fdw \
postgresql11-pgsql-ogr-fdw-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.32 \
postgresql11-server"

inherit rpm
