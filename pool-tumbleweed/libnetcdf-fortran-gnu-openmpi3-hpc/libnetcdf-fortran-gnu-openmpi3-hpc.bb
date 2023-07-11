SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-openmpi3-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-openmpi3-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-openmpi3-hpc-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "5279d0bc75e9c89c096adba018853785600c4e0fc858cc8845db83c846a2e47d4647838b39c58325f73d70f0d0cb33bd25d26bf5354116b5d3842dfc713ff849"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-fortran-4-5-3-gnu-openmpi3-hpc"

inherit rpm
