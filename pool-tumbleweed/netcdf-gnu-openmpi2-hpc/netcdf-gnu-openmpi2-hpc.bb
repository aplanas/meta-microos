SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi2-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi2-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi2-hpc-4.9.2-1.1.noarch.rpm"
RPM_HASH = "ea106658b4ac203467433a6ce22871635f511419395a339242880fbf1ff5d9718187eebdc25649553c3261bb3951e82c8ea68994da7194eab0542f66b7b31e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-openmpi2-hpc"

inherit rpm
