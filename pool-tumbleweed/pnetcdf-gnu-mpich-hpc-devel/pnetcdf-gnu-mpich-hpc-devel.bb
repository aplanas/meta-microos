SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-mpich-hpc-devel"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-mpich-hpc-devel provides the dependency to get binary package pnetcdf_1_12_3-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-mpich-hpc-devel-1.12.3-1.4.noarch.rpm"
RPM_HASH = "cbac8d514aa70e31dd10bf9d2f68df41011f4c2b3bd6011ebebbf72b2d77d8c03c3637acb6014706814db003d84eb0f046e72618eda0bbb3012d0adebeb702d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-mpich-hpc-devel"

inherit rpm
