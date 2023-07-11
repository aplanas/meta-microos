SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-mpich-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-mpich-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-mpich-hpc-devel-4.5.3-4.6.noarch.rpm"
RPM_HASH = "4e5b6922c2d010fa692c7397bfbfd53c1345195db778b95e562245c383ab9a61aa4e243d2b38f417e73648a3b47ac30b9884f46f6caec38924cd3aff177ebeea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-mpich-hpc \
netcdf-fortran-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "netcdf-fortran-4-5-3-gnu-mpich-hpc-devel"

inherit rpm
