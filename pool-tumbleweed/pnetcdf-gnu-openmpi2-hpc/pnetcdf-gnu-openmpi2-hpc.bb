SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-openmpi2-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-openmpi2-hpc provides the dependency to get binary package pnetcdf_1_12_3-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-openmpi2-hpc-1.12.3-1.4.noarch.rpm"
RPM_HASH = "0018ce37549156602a89f016580c0dee8c2d7cc7faccd3728b619be61cce0073d0ab9c6213377ec65a8b92ec166d4b5008a761e4a67fd90733eda1fbfb7bc4c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-openmpi2-hpc"

inherit rpm
