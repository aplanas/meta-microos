SUMMARY = "Static development files for pnetcdf-openmpi2"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-openmpi2-devel-static-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "1050ef6b23503d70af2a29c31365a1729603c75d51ba0803113c8cb29b7619708d3f266d56b2f624e5ad13451d75af02706af9ec551d37f9be8f5cfac2b2053d"

RPROVIDES:${PN} += "parallel-netcdf-openmpi2-devel-static \
pnetcdf-openmpi2-devel-static"

RDEPENDS:${PN} += "pnetcdf-openmpi2-devel"

inherit rpm
