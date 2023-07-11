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

RPM_NAME = "pnetcdf-mpich-devel-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "ca19237e4da14dac80834e586c2e5c6335cc22c3bd10532921241e81356398fe18486624cef3a9379eaaa472cfb9ae7078225e19f35dfc8cdb5c4aed43fa3ca8"

RPROVIDES:${PN} += "parallel-netcdf-mpich-devel \
pkgconfig-pnetcdf \
pnetcdf-mpich-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-mpich \
mpich-devel \
pnetcdf-devel-data"

inherit rpm
