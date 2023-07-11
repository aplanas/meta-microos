SUMMARY = "Dependency package for netcdf_4_9_2-gnu-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-hpc-4.9.2-1.2.noarch.rpm"
RPM_HASH = "d37e946c13aa571c590e606a91c82eb5df768a8a5f56495a6b1d957e41eed33302074601e583bbf179f298bb31d43859f3a22dccf50251d871125547b3f005bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-hpc"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-hpc"

inherit rpm
