SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-openmpi1-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-openmpi1-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi1-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-openmpi1-hpc-4.5.3-4.6.aarch64.rpm"
RPM_HASH = "37f18264b1f2b1e3e0b79b261fc0a1fb6d8f24a6f6135cb2963d379a24dc6bfbd94d8835e04dfd40eaaaf32f1637cf731581498e34057033a68e39a0038c6cda"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-fortran-4-5-3-gnu-openmpi1-hpc"

inherit rpm
