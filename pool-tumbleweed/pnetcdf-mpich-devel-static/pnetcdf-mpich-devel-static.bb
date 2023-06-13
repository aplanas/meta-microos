SUMMARY = "Static development files for pnetcdf-mpich"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mpich versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-mpich-devel-static-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "70e7d6c9031caaae1ac85f36856f6b00634f6346ee7601c128b3944cc06ddbfd0d24b2f296eb2f116cc2fc63fa6eded94404ce4c9862c4e22682e87a10016339"

RPROVIDES:${PN} += "parallel-netcdf-mpich-devel-static \
pnetcdf-mpich-devel-static \
pnetcdf-mpich-devel-static(aarch-64)"

RDEPENDS:${PN} += "pnetcdf-mpich-devel"

inherit rpm
