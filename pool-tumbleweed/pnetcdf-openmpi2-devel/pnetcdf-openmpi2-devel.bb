SUMMARY = "Development files for pnetcdf-openmpi2"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the openmpi version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-openmpi2-devel-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "8ea54008ca08dbf285a95ce91af37e381ff2db482cfab81a8cc1de4b14600ae5e96a070c5269ac121d2ce195030794e85e99fd25d39eb6e1be83cc877c66db0c"

RPROVIDES:${PN} += "parallel-netcdf-openmpi2-devel \
pkgconfig(pnetcdf) \
pnetcdf-openmpi2-devel \
pnetcdf-openmpi2-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-openmpi2 \
openmpi2-devel \
pnetcdf-devel-data"

inherit rpm
