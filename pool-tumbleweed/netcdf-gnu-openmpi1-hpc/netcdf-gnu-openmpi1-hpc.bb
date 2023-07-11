SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi1-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi1-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi1-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi1-hpc-4.9.2-1.2.noarch.rpm"
RPM_HASH = "01ab89b121f099ddb8901aedfc1354aab7ba9dfe49d34df5a2b8b5e3cccf0df6637ddeb4a9156534e4c597b4007534f8e7d9bbb84befa2074aad5e304c3f6e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-openmpi1-hpc"

inherit rpm
