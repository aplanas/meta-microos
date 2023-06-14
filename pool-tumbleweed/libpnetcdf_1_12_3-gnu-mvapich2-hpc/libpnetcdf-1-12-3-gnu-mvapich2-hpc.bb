SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mvapich2 version of the PnetCDF runtime \
libraries."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf_1_12_3-gnu-mvapich2-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "a81169473a2213be3a5ac8e5a1b465ba8fb613c5167d4de29d64a728830026298e48dfb0c700199033047f065db864c96c9002a7aa110ab1bc425709cbc64c80"

RPROVIDES:${PN} += "libpnetcdf-1-12-3-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libstdc++.so.6 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
