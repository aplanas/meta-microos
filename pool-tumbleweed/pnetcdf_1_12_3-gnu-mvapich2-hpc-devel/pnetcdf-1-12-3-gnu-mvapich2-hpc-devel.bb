SUMMARY = "Development files for pnetcdf_1_12_3-gnu-mvapich2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the mvapich2 version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-mvapich2-hpc-devel-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "27ecb34a8fe02c2140fdeffda410ae5523bf33f923433ae067df85d88e585f814d3810e091ba9eca2946e313acc9911420d2094465fa93b5d00f99964ba264f0"

RPROVIDES:${PN} += "pkgconfig-pnetcdf \
pnetcdf-1-12-3-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libpnetcdf-1-12-3-gnu-mvapich2-hpc \
libstdc++.so.6 \
mvapich2-gnu-hpc-devel"

inherit rpm
