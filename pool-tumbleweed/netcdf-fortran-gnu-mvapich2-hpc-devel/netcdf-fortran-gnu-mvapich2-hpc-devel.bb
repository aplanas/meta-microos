SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-mvapich2-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-mvapich2-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-mvapich2-hpc-devel-4.5.3-4.5.noarch.rpm"
RPM_HASH = "e5c579016b82a3aeae47938a1a713a0bb09f3faf3c0521bae4ab0ecb5d7eb46253fd42d8adf53556971488efac04484caf054d5e27de74f1a82d585dc1b981ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-mvapich2-hpc \
netcdf-fortran-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "netcdf-fortran_4_5_3-gnu-mvapich2-hpc-devel"

inherit rpm
