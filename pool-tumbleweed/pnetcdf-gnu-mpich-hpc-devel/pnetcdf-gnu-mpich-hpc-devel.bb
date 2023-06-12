SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-mpich-hpc-devel"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-mpich-hpc-devel provides the dependency to get binary package pnetcdf_1_12_3-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-mpich-hpc-devel-1.12.3-1.3.noarch.rpm"
RPM_HASH = "f4778195b5f5566be371bcfb8a19cf0c143ad21e18cb6163ba6f425530b9a7b1e747511f8e2f8015811d48d2d18d73a7d9943a960727a74e023716f75c07b4c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-mpich-hpc-devel"
RDEPENDS:${PN} += "pnetcdf_1_12_3-gnu-mpich-hpc-devel"

inherit rpm
