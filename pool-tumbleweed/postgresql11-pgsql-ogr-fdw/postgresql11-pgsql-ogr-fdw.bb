SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "postgresql11-pgsql-ogr-fdw-1.1.0-4.2.aarch64.rpm"
RPM_HASH = "273b1ebdcc458cbf35c5f70cd6a469c49f2168c4a21f925e0ef30c931aa46676949b3c5c9866947243e95eeef605f7467acb19b360615e076fd0d191d5e29186"

RPROVIDES:${PN} += "postgresql11-pgsql-ogr-fdw \
postgresql11-pgsql-ogr-fdw(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdal.so.32()(64bit) \
postgresql11-server"

inherit rpm
