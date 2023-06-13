SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "postgresql12-pgsql-ogr-fdw-1.1.0-4.2.aarch64.rpm"
RPM_HASH = "4b328111b93edd6365330afef18d62dc5c5f50fcbbbbc51de1322961aef3e7f37c3fe42afdcd50b5d745250175f1693092de8cc6ee6af8f93469383c3d435a73"

RPROVIDES:${PN} += "postgresql12-pgsql-ogr-fdw \
postgresql12-pgsql-ogr-fdw(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdal.so.32()(64bit) \
postgresql12-server"

inherit rpm
