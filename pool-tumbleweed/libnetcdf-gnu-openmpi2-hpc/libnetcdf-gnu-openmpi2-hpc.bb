SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-openmpi2-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-openmpi2-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-openmpi2-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "4399fd13e5acabe34b8c3081aa4aceaa74bb531ad5b544a2f5946cb478fbb789ee9dcb9b837e120ded5987e1dffe0057e8f992bf7ee2eeaee94dc093455efe1d"

RPROVIDES:${PN} += "libnetcdf-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/bin/sh \
libnetcdf-4-9-2-gnu-openmpi2-hpc"

inherit rpm
