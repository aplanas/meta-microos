SUMMARY = "Dependency package for libnetcdf-fortran_4_5_3-gnu-openmpi4-hpc"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-fortran-gnu-openmpi4-hpc provides the dependency to get binary package libnetcdf-fortran_4_5_3-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "libnetcdf-fortran-gnu-openmpi4-hpc-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "0678d1c1a6348ac73152e3ba7740545ea83bed4f2ecc7e70796c9ac0c3f51db4df134007802a79bcecac19c5a4362d654ddea6fd0c67096971903d05cc4206c9"

RPROVIDES:${PN} += "libnetcdf-fortran-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-fortran-4-5-3-gnu-openmpi4-hpc"

inherit rpm
