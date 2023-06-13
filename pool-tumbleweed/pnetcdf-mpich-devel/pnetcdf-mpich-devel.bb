SUMMARY = "Development files for pnetcdf-mpich"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the mpich version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-mpich-devel-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "5b733a3eca39ed293e6707ddad9dd8e30e24f43213481dec428dd820f60f223fdfb35ab779ec5010cccc8620f31174516143ef88965bde401f0a49c8850ec94d"

RPROVIDES:${PN} += "parallel-netcdf-mpich-devel \
pkgconfig(pnetcdf) \
pnetcdf-mpich-devel \
pnetcdf-mpich-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-mpich \
mpich-devel \
pnetcdf-devel-data"

inherit rpm
