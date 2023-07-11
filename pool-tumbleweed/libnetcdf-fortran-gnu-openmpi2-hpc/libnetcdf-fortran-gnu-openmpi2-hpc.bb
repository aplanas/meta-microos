SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-openmpi2-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-openmpi2-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-openmpi2-hpc-4.5.3-4.6.aarch64.rpm"
RPM_HASH = "b8793d04451174d7e4f4040fab85ffddc5445b579f0c0d3cacd9a80202848b08808c8201b5c20bc08a86e9547bffa645be777f5f62f844dad4182c847d679769"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-fortran-4-5-3-gnu-openmpi2-hpc"

inherit rpm
