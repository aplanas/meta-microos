SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi3-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi3-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi3-hpc-4.9.2-1.2.noarch.rpm"
RPM_HASH = "0f7f67116f571dfd5209cf576db2670ccbc8223e60683a898e533bbeb61ffff882d949280101ea741c7ff23d4d4301e1eea19512bbd05497d79513beaaaebf15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-openmpi3-hpc"

inherit rpm
