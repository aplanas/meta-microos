SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-mvapich2-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-mvapich2-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-mvapich2-hpc-devel-4.5.3-4.6.noarch.rpm"
RPM_HASH = "30b6afd6b95ab3be9603c576b722dc7cc7cd33da6b65fd2967af1aac9e61274e51199751874ecd0e4e38a1e926111a6c3d3b5eb5cb45f9aae1a2e88b5fdd843d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-mvapich2-hpc \
netcdf-fortran-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "netcdf-fortran-4-5-3-gnu-mvapich2-hpc-devel"

inherit rpm
