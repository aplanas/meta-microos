SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi1-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi1-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi1-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi1-hpc-4.9.2-1.1.noarch.rpm"
RPM_HASH = "373056cda835ec0e4d79cba5a86c8e819cb4ef9eaddec5f6d827de58aec65f503a9c655d434e8524f51883c1ff45f007d110573641e3b0c53e133d8b2d6d3549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-openmpi1-hpc"

inherit rpm
