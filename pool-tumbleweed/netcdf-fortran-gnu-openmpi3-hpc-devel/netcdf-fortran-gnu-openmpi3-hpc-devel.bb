SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-openmpi3-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-openmpi3-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-openmpi3-hpc-devel-4.5.3-4.5.noarch.rpm"
RPM_HASH = "6718b44319677cfffb653c8c7adf7de1800acfe94ccbfd1688be58083a8b394e03dcf823b733462c1cef6b52dfe95ef545f75c434943f2c2d115e0e590eb93fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-openmpi3-hpc \
netcdf-fortran-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "netcdf-fortran-4-5-3-gnu-openmpi3-hpc-devel"

inherit rpm
