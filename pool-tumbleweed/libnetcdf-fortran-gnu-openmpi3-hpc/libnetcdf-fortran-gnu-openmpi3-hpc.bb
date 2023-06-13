SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-openmpi3-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-openmpi3-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-openmpi3-hpc-4.5.3-4.4.aarch64.rpm"
RPM_HASH = "67cccddf161184bdbb7aceb5df622abd80f3fbb8efd13b261139d13a1bf58726ab2231a9fb672513b1d5a6edcbb4204f6897e6614d679ca7928e4ddb1bfd5ecc"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-openmpi3-hpc \
libnetcdf-fortran-gnu-openmpi3-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libnetcdf-fortran_4_5_3-gnu-openmpi3-hpc"

inherit rpm
