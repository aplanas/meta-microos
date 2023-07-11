SUMMARY = "Dependency package for libpnetcdf_1_12_3-gnu-mvapich2-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package libpnetcdf-gnu-mvapich2-hpc provides the dependency to get binary package libpnetcdf_1_12_3-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf-gnu-mvapich2-hpc-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "bb061758b0109a2cb3a40848ea9706a134b71f6850f40d97974ed5158038a869d1d4dfc84d5956eae376d8003d1dfa6344f8cf505dc47f32d3605c33d1e8ac2c"

RPROVIDES:${PN} += "libpnetcdf-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpnetcdf-1-12-3-gnu-mvapich2-hpc"

inherit rpm
