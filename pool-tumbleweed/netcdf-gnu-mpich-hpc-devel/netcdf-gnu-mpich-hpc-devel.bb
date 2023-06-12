SUMMARY = "Dependency package for netcdf_4_9_2-gnu-mpich-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-mpich-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-mpich-hpc-devel-4.9.2-1.1.noarch.rpm"
RPM_HASH = "6cb7d101cdff138568dd775e1a4e21669ba2cdf53e08e0c5b88b91b3c4b87b74b09cc3605a40f8d3f2417b75282c9e917185d6d7ba0c5a58292b6cb3df3a10c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-mpich-hpc-devel"
RDEPENDS:${PN} += "netcdf_4_9_2-gnu-mpich-hpc-devel"

inherit rpm
