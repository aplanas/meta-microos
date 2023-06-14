SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-mpich-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-mpich-hpc provides the dependency to get binary package pnetcdf_1_12_3-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-mpich-hpc-1.12.3-1.3.noarch.rpm"
RPM_HASH = "3dc7838ee145d4183650a16d007dc0c47566a4f8aba6ab0a52e92cb492f8368bb8fdebe00937aa5f32d660ec0243aaac5437c59c02b3f35ab9564a3fdd2826cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-mpich-hpc"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-mpich-hpc"

inherit rpm
