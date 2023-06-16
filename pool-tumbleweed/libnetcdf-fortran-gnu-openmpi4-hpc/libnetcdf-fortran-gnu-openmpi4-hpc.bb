SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-openmpi4-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-openmpi4-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-openmpi4-hpc-4.5.3-4.4.aarch64.rpm"
RPM_HASH = "1e1717260db66a1c7246fbdcc36c7934195d0d29398c665a56f28b5e207ddf4dc3fd2d419893c62b6b396313c388c027b8cc259bd6530beb12e50009ce9c9219"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-fortran-4-5-3-gnu-openmpi4-hpc"

inherit rpm
