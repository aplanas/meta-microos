SUMMARY = "Dependency package for libpnetcdf_1_12_3-gnu-mpich-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package libpnetcdf-gnu-mpich-hpc provides the dependency to get binary package libpnetcdf_1_12_3-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf-gnu-mpich-hpc-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "f4f9e26180f2ca1e357109c584594afe11b0670898c19e627961591cec6ac66febb0d13ba30fd4629fd1b204d14b4bff7547b5b0621aff4ef0d026ec01255e3d"

RPROVIDES:${PN} += "libpnetcdf-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpnetcdf-1-12-3-gnu-mpich-hpc"

inherit rpm
