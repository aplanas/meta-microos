SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "postgresql11-pgsql-ogr-fdw-1.1.0-4.4.aarch64.rpm"
RPM_HASH = "055d2fafc4b5b766774acc12377c626cd8972a960cd306a9cd3acdd598fc3295f1aebf60a6ac4dce819b431e76e64ef35f41852d42f4b2c2ae04bd126974df0a"

RPROVIDES:${PN} += "postgresql11-pgsql-ogr-fdw"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.32 \
postgresql11-server"

inherit rpm
