SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-mpich-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-mpich-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-mpich-hpc-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "49086cf2e52f92c5a5786e6c23f6f69c51f0228ca10b2352ccdacd4705b4fdcb00a7a629a8846e607f9786795082c6f22f5a2463d85fad171bfba19a9ad3255a"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-mpich-hpc \
libnetcdf-fortran-gnu-mpich-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libnetcdf-fortran_4_5_3-gnu-mpich-hpc"

inherit rpm
