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

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi4-hpc-devel-static-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "ef1f3ae5a9b010a00ba16e0758e9626c122296461ea4a3e3b19ce29f5a0f8a7b4ae7172025df19af6819d9479be8108cddfdf5ab46c300b0816ee6042abce010"

RPROVIDES:${PN} += "pnetcdf-1-12-3-gnu-openmpi4-hpc-devel-static"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-openmpi4-hpc-devel"

inherit rpm
