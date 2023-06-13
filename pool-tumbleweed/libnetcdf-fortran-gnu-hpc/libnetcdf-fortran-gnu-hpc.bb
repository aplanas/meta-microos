SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-hpc-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "61064d4c0f42cc2be386233ccbd047f8c0579d4c00733e3c9f922b871175ce8309c79193d11879e2d3d73f5a5e00db961897647a9826ee42c72141c56ad82b59"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-hpc \
libnetcdf-fortran-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libnetcdf-fortran_4_5_3-gnu-hpc"

inherit rpm
