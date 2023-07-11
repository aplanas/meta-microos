SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "769aaab32a8d8c38ae68b0056c015bd52cc13d7872a3fb660db146629377a1c4027365cd78fd97276ea15f193dbe56b303ca7e76bcb7b20670c0b8f90e8677b1"

RPROVIDES:${PN} += "libnetcdf-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-4-9-2-gnu-hpc"

inherit rpm
