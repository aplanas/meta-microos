SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi1-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi1-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi1-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi1-hpc-devel-4.9.2-1.1.noarch.rpm"
RPM_HASH = "108df45495fda2427396b306321f8e6e4b0d7757dda7926130343d6e1cc86e999ccbc2a46c429f4c19b9fbf51953f0d7349f36759f69ca048369e00725aea382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "netcdf_4_9_2-gnu-openmpi1-hpc-devel"

inherit rpm
