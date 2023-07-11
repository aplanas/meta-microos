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

RPM_NAME = "pnetcdf-openmpi2-devel-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "e8fb0e5ad7c7685067a9ef7aa7fb083f240eb2d0bc531efd2678d8d60ff053ddce489ea31dfb524fed005495b4d131707dfc3f2daecd6465a9ddcaebcb9c6186"

RPROVIDES:${PN} += "parallel-netcdf-openmpi2-devel \
pkgconfig-pnetcdf \
pnetcdf-openmpi2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-openmpi2 \
openmpi2-devel \
pnetcdf-devel-data"

inherit rpm
