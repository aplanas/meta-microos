SUMMARY = "Dependency package for libpnetcdf_1_12_3-gnu-mvapich2-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package libpnetcdf-gnu-mvapich2-hpc provides the dependency to get binary package libpnetcdf_1_12_3-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf-gnu-mvapich2-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "b3379f4cd315347d55fe329bd7a9e279c42ca5dccc89f5de07879fcef655c9a544423da9a730b8bade81b2e27422835f28f8279d3463dd8b2a7e0593432acf5c"

RPROVIDES:${PN} += "libpnetcdf-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpnetcdf-1-12-3-gnu-mvapich2-hpc"

inherit rpm
