SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-openmpi2-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-openmpi2-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-openmpi2-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "dca30f2cbff8f9e059a67f776d11bc4cbe156283afcaa869710e43072336105663c26c4c21cb459f2ad27a7ffc5a3c0243e207435082d5fb82320b7829624ee4"

RPROVIDES:${PN} += "libnetcdf-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-4-9-2-gnu-openmpi2-hpc"

inherit rpm
