SUMMARY = "Static development files for pnetcdf_1_12_3-gnu-mpich-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mpich versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-mpich-hpc-devel-static-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "ea7dd41cf5734d259021b189b341ffe85c36edf0197648f55c428b40a6617e37c8c3510b2bed237c7152dc620da5cae76980342be627ae4c0a2caba093e09fae"

RPROVIDES:${PN} += "pnetcdf-1-12-3-gnu-mpich-hpc-devel-static"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-mpich-hpc-devel"

inherit rpm
