SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-openmpi1-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-openmpi1-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi1-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-openmpi1-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "2d55f898ab217b097881c767ed61b24ded3f7b709bc3b9f12b285c0b1536e10755c7121f48128845ce0f0a55bc85e720454b0faa6e551d2553baf1b51f71b23c"

RPROVIDES:${PN} += "libnetcdf-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-4-9-2-gnu-openmpi1-hpc"

inherit rpm
