SUMMARY = "Static development files for pnetcdf-openmpi3"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-openmpi3-devel-static-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "6564af1b96c19323ed88fbc3c17f81d77d6d7ad69431b3629c310bc4813d73c51a74639f96d6384b174714a86159b417bad6cccb323c334985587b74e085d043"

RPROVIDES:${PN} += "parallel-netcdf-openmpi3-devel-static \
pnetcdf-openmpi3-devel-static"

RDEPENDS:${PN} += "pnetcdf-openmpi3-devel"

inherit rpm
