SUMMARY = "Development files for pnetcdf_1_12_3-gnu-openmpi2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the openmpi version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi2-hpc-devel-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "408dbe4c5c15e32dba9788b9e9c8a3c5ea3eaf55f8948622aaa2986abcad8cc2076af9f38129fb945c27433fa0be0c81f1ebc34def0a6dc55c596efb8cb53f74"

RPROVIDES:${PN} += "pkgconfig-pnetcdf \
pnetcdf-1-12-3-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libpnetcdf-1-12-3-gnu-openmpi2-hpc \
libstdc++.so.6 \
openmpi2-gnu-hpc-devel"

inherit rpm
