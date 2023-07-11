SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-openmpi1-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-openmpi1-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi1-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-openmpi1-hpc-devel-4.5.3-4.6.noarch.rpm"
RPM_HASH = "fd8b0b698e8f71e730e155a9963598daa66dd85ecbd289c909edf4eda9e652a1cda36c0ae52175432c586bd41c996d0da26904d002825937755afcec8748f896"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-openmpi1-hpc \
netcdf-fortran-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "netcdf-fortran-4-5-3-gnu-openmpi1-hpc-devel"

inherit rpm
