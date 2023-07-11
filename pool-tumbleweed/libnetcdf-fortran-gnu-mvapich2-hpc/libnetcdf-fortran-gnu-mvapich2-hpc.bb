SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-mvapich2-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-mvapich2-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-mvapich2-hpc-4.5.3-4.6.aarch64.rpm"
RPM_HASH = "b9424cb824b6dd355ab51291d934352ce30a214c98bdb26e0d73d469297141a5d68fc1ba587e6955043464ee51387e723f701d97dcbb25f49475eb8be14e8925"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-fortran-4-5-3-gnu-mvapich2-hpc"

inherit rpm
