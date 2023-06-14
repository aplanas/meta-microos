SUMMARY = "Static development files for pnetcdf-openmpi4"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-openmpi4-devel-static-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "07ddf655be7213a781402a4baaeeeac44b4117982ae99055ef82a6f1a093b17071426b40421c54381f84b84f807d5a560e50c6864bf97c0a19f95e2618a3c1ee"

RPROVIDES:${PN} += "parallel-netcdf-openmpi4-devel-static \
pnetcdf-openmpi4-devel-static"

RDEPENDS:${PN} += "pnetcdf-openmpi4-devel"

inherit rpm
