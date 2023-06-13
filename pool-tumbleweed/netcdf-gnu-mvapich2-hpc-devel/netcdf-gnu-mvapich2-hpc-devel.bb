SUMMARY = "Dependency package for netcdf_4_9_2-gnu-mvapich2-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-mvapich2-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-mvapich2-hpc-devel-4.9.2-1.1.noarch.rpm"
RPM_HASH = "645f72ba211fa3d12aa26f636db105e544b527489b28e9b4f67570596840417dceff25c8634e7355b2a8baefa6fd0c94c83901b35b7ae10623deeb889df23af2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "netcdf_4_9_2-gnu-mvapich2-hpc-devel"

inherit rpm
