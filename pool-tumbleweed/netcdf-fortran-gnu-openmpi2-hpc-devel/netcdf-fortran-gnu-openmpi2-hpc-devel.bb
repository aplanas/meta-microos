SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-openmpi2-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-openmpi2-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-openmpi2-hpc-devel-4.5.3-4.6.noarch.rpm"
RPM_HASH = "223721cee7c6155c3130fc2e2df4c403d8379470bc40a54cd39b5572314fd79d7d424c5e347e8a4ab1c1a8dccc8c0643a790df7eec260e9d279fa7c003d3db16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-openmpi2-hpc \
netcdf-fortran-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "netcdf-fortran-4-5-3-gnu-openmpi2-hpc-devel"

inherit rpm
