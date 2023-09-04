SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "postgresql15-pgsql-ogr-fdw-1.1.4-2.2.aarch64.rpm"
RPM_HASH = "7b1f5fb450b101575d798765606538875f8722bb0237f6865ede753c9a279ee76d31c1864b728aa2e795ddda69d72c91acfbecc2929c2ee42f64414dc793bfd6"

RPROVIDES:${PN} += "postgresql15-pgsql-ogr-fdw \
postgresql15-pgsql-ogr-fdw-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.32 \
postgresql15-server"

inherit rpm
