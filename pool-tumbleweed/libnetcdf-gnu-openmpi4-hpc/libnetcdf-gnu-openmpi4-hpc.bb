SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-openmpi4-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-openmpi4-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-openmpi4-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "a153bf29cb5b8211993d0be26f1bd07df9afd284dbdb6d40e4a891bda57da179fc6729e4fd4b3b9d2e321cc326c8b64a140d3e81115bf000e38f9b7d25f36de5"

RPROVIDES:${PN} += "libnetcdf-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-4-9-2-gnu-openmpi4-hpc"

inherit rpm
