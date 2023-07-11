SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-openmpi3-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-openmpi3-hpc provides the dependency to get binary package pnetcdf_1_12_3-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-openmpi3-hpc-1.12.3-1.3.noarch.rpm"
RPM_HASH = "9088714af9fa81c62b8689df6e95bae777f2c6b5f84c43ebb35a0972b09a7e25b439797024eae7eed3b94d54eaddf5af5683106983a2021b84a0acab89c6b538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-openmpi3-hpc"

inherit rpm
