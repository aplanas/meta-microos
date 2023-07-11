SUMMARY = "Dependency package for libpnetcdf_1_12_3-gnu-openmpi3-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package libpnetcdf-gnu-openmpi3-hpc provides the dependency to get binary package libpnetcdf_1_12_3-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf-gnu-openmpi3-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "48790e0885e56e6bc3f6e1c8835dc6da8ca2422d3bf6fbd3d6901f71a9d269124f1385de76ff02250a8a09a04ba8fcedc0f439d6e9c59442cc99d8a0a96824b7"

RPROVIDES:${PN} += "libpnetcdf-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpnetcdf-1-12-3-gnu-openmpi3-hpc"

inherit rpm
