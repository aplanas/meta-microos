SUMMARY = "Development files for pnetcdf_1_12_3-gnu-openmpi4-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the openmpi version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi4-hpc-devel-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "46f7386725ec2088f89fa4c99d08385a4f44e91a9359078f408c09587b5a88cd993a034b9805bad63461399af29f5a5ebd401ff324ecf7a78f58bf4288ab8a6c"

RPROVIDES:${PN} += "pkgconfig-pnetcdf \
pnetcdf-1-12-3-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libpnetcdf-1-12-3-gnu-openmpi4-hpc \
libstdc++.so.6 \
openmpi4-gnu-hpc-devel"

inherit rpm
