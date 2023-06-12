SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-openmpi2-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-openmpi2-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-openmpi2-hpc-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "f6175240e30a9699b66b534a81c3fe50a46f35c5a683904ef8706733c142bd497d828386eafbc086592af5c0fa420a3cd82fd4fc8675a00afd0be3f986dec074"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-openmpi2-hpc \
libnetcdf-fortran-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libnetcdf-fortran_4_5_3-gnu-openmpi2-hpc"

inherit rpm
