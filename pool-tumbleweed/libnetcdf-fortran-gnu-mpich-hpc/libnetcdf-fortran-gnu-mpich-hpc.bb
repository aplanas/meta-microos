SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-mpich-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-mpich-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-mpich-hpc-4.5.3-4.6.aarch64.rpm"
RPM_HASH = "b2169d8a18b95361c4854c680447cc27c316a151c8896090ce1b32e756dc4b90375d54b5eb09a31e951c03bd72d7e3675afccb43966fce345d25d00848ef9363"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-fortran-4-5-3-gnu-mpich-hpc"

inherit rpm
