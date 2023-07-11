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

RPM_NAME = "pnetcdf_1_12_3-gnu-mvapich2-hpc-devel-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "1600afb61aeb11401de2724374c9adeda2baf51924d1b87d81bc7f4957bc67b0805379018ebf6fd57e18b162cbade807cebc4f2c1eeb1e58aeddc3f6aef4528a"

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
