SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-hpc-4.5.3-4.6.aarch64.rpm"
RPM_HASH = "ff517298e271ca6c589522baebd66069f087f7a06c1fe89762054e0052fd5a0eccb9f2edd3314f9da9ec6baad8bf3bb7b758c411f756505e477b32f967dc732a"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-fortran-4-5-3-gnu-hpc"

inherit rpm
