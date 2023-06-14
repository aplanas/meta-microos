SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-openmpi2-hpc-devel"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-openmpi2-hpc-devel provides the dependency to get binary package pnetcdf_1_12_3-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-openmpi2-hpc-devel-1.12.3-1.3.noarch.rpm"
RPM_HASH = "3ccc66a7ff7078cf44d4647111034df675606a4a553fd5153cf136f136e56d3650c1b730177fa49df558df3d99b2b687b144a650aa044dd295e6b2ada55755f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-openmpi2-hpc-devel"

inherit rpm
