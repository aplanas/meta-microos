SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-openmpi4-hpc-devel"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-openmpi4-hpc-devel provides the dependency to get binary package pnetcdf_1_12_3-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-openmpi4-hpc-devel-1.12.3-1.3.noarch.rpm"
RPM_HASH = "ac83f8a23080c992a863bc57050c71823eb3dc57cd12afc5bc7c11bc6f930ba950d2fc5c0e6f60b79f835455642ad4edecc33e5bf76c94b318841f19196c0308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-openmpi4-hpc-devel"

inherit rpm
