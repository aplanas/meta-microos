SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi3-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi3-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi3-hpc-4.9.2-1.1.noarch.rpm"
RPM_HASH = "a0291cd4742bbb6b1c1bb627b12ca04c80b1dbcacc15046ecbc913b33426392f629fa9dd0e17b3072a53bfd98e91c4f6a9d8f32b583763c1504186d5c19b1c12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi3-hpc"
RDEPENDS:${PN} += "netcdf_4_9_2-gnu-openmpi3-hpc"

inherit rpm
