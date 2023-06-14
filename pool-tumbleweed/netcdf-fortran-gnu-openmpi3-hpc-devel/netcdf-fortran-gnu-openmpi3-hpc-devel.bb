SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-openmpi3-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-openmpi3-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-openmpi3-hpc-devel-4.5.3-4.4.noarch.rpm"
RPM_HASH = "59b53969d4271e6d5f8e2ea214c15510f6d446d4da769b410f041a47aae759f46dbf05f6a5482558c53eadacbe8a7c2b5147456482e900db32aff4ce032ab9b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-openmpi3-hpc \
netcdf-fortran-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "netcdf-fortran-4-5-3-gnu-openmpi3-hpc-devel"

inherit rpm
