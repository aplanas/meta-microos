SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-openmpi3-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-openmpi3-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-openmpi3-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "254e4e7d4e39f840893033f9e6dc14c6d78399955820424864f3c46b4605b6069c6e3e354b34ec98998ce1014ed687c81153ebc6eec7bb86434ba9234044f86b"

RPROVIDES:${PN} += "libnetcdf-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetcdf-4-9-2-gnu-openmpi3-hpc"

inherit rpm
