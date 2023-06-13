SUMMARY = "Static development files for pnetcdf_1_12_3-gnu-openmpi4-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi4-hpc-devel-static-1.12.3-1.2.aarch64.rpm"
RPM_HASH = "2d7ecf8b85d4e3c214ea9b3e29f3953f575b1de8d5cf4c8127cde0a6e30bb9ca813bc74a5508b5b1a5088030dfbf5841a842286164fc5aa9564b93c2bb6abdda"

RPROVIDES:${PN} += "pnetcdf_1_12_3-gnu-openmpi4-hpc-devel-static \
pnetcdf_1_12_3-gnu-openmpi4-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "pnetcdf_1_12_3-gnu-openmpi4-hpc-devel"

inherit rpm
