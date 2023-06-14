SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-openmpi1-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-openmpi1-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi1-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-openmpi1-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "ede9ffd4a0ecb163f88776fcf485dc8cc5af72256cf1f7163244e2882a292b74c810a1ebee0a59fa70d92008861c891fb4a0bfba7e414466a2e389b03e1016be"

RPROVIDES:${PN} += "libnetcdf-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/bin/sh \
libnetcdf-4-9-2-gnu-openmpi1-hpc"

inherit rpm
