SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi2-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi2-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi2-hpc-4.9.2-1.2.noarch.rpm"
RPM_HASH = "2477d218ae16ab550949defe2e9c4845b0a68137eaa7334d94f194cc55c0732b901ad440db270ab7985816284f16aac74d403b4268cd29fb3f81924f572c1f40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-openmpi2-hpc"

inherit rpm
