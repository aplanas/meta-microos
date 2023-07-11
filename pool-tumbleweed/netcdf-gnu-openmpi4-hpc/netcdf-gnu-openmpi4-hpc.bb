SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi4-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi4-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi4-hpc-4.9.2-1.2.noarch.rpm"
RPM_HASH = "9cbec492c5dca3a8fdbf6e44d94aa68ad5e5c77dad2dea5adda1402b2c441a113c879ff89e3aa0a69f72c73cff7f215d818cc879d98f457e811b9439e0c69c48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-openmpi4-hpc"

inherit rpm
