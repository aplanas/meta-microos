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

RPM_NAME = "pnetcdf-openmpi4-devel-static-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "57c2e230708d9a013ebb8cdd118c5a477a1ea754ee5a6496a607eb132f38db4a567a3d1cc9b97806a576c1d62dab663cc4228048909988cb812096da5d258dd5"

RPROVIDES:${PN} += "parallel-netcdf-openmpi4-devel-static \
pnetcdf-openmpi4-devel-static"

RDEPENDS:${PN} += "pnetcdf-openmpi4-devel"

inherit rpm
