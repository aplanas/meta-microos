SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-openmpi1-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-openmpi1-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi1-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-openmpi1-hpc-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "9e520a8bbe18aa5d254bb8bc44b87caacf0e0128adef6998dc5faa76f27fe0645fa724f7fe89e18ba68b15d22d0fd704ad24377c500bab9477ec285462d9690f"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-openmpi1-hpc \
libnetcdf-fortran-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libnetcdf-fortran_4_5_3-gnu-openmpi1-hpc"

inherit rpm
