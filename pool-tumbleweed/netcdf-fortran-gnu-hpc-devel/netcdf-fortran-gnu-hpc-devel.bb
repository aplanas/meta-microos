SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-hpc-devel-4.5.3-4.6.noarch.rpm"
RPM_HASH = "06eebb45bf72170343994f2732c80d7f055b558b5dc7dd5028f6e8f26761391cb55f7772d296458034a44c4a6ea062d886b4c548dd818ebeae184c909352e412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-hpc \
netcdf-fortran-gnu-hpc-devel"

RDEPENDS:${PN} += "netcdf-fortran-4-5-3-gnu-hpc-devel"

inherit rpm
