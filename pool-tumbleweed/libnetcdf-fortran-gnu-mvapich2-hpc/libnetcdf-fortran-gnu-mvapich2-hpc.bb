SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-mvapich2-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-mvapich2-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-mvapich2-hpc-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "1389722a6365a6dcb03a1089b66791c757a0750cb7a5d56817c38de548fd9306b83a10685db7f6ce3899a89645cc840c8f331b67d4547e2f2bcd8d44b8c401f2"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-mvapich2-hpc \
libnetcdf-fortran-gnu-mvapich2-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libnetcdf-fortran_4_5_3-gnu-mvapich2-hpc"

inherit rpm
