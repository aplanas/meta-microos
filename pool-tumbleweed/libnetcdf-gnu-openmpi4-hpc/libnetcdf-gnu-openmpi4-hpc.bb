SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-openmpi4-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-openmpi4-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-openmpi4-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "483443a57fc64908d907e79f223abd7658f8b6ecd54fa1cd7dca9958eee52ec8da3ea0b119252495a9cd29077b553bb15a2dc87cc5c2fafb4d1a532fb2f90f78"

RPROVIDES:${PN} += "libnetcdf-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/bin/sh \
libnetcdf-4-9-2-gnu-openmpi4-hpc"

inherit rpm
