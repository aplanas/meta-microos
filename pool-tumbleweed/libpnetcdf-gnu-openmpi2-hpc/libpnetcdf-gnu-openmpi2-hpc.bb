SUMMARY = "Dependency package for libpnetcdf_1_12_3-gnu-openmpi2-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package libpnetcdf-gnu-openmpi2-hpc provides the dependency to get binary package libpnetcdf_1_12_3-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf-gnu-openmpi2-hpc-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "438365a009ae455ea25f73f077ad383c45923085e4561921f43b4a398f709c28ca957df5bb7868f14d1cec3cffdb37edbc4ec8f0e3d46614bbc30ad7e31a731d"

RPROVIDES:${PN} += "libpnetcdf-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpnetcdf-1-12-3-gnu-openmpi2-hpc"

inherit rpm
