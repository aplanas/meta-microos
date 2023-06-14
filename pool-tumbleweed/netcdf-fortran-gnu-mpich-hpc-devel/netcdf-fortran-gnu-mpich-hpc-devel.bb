SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-mpich-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-mpich-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-mpich-hpc-devel-4.5.3-4.5.noarch.rpm"
RPM_HASH = "40a95078ed777e9b3d87bb5bd8c1a2780f647fc5d639feba38584bc9c52b8ebc18d3dfc9c705308088ae9bb420087c53a9463e9ce46fd329646140538ba3da11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-mpich-hpc \
netcdf-fortran-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "netcdf-fortran-4-5-3-gnu-mpich-hpc-devel"

inherit rpm
