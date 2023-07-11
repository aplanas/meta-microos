SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-openmpi4-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-openmpi4-hpc provides the dependency to get binary package pnetcdf_1_12_3-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-openmpi4-hpc-1.12.3-1.3.noarch.rpm"
RPM_HASH = "32d16f12e987ff125079f6d1586c72471222bae19206293ea45813ca47be0eafc8bff38482144913a84b90ec978735ac264d4d689fea4b5a23bc0aeec1a73a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-openmpi4-hpc"

inherit rpm
