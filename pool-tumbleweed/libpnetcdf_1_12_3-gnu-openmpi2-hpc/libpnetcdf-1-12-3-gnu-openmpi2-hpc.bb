SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi version of the PnetCDF runtime \
libraries."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf_1_12_3-gnu-openmpi2-hpc-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "ae842af193ab64f61cb552f69a0aaeb5ec1811e1af36c73bda870ea0fddb79253c78545a49c3f0a5985a409f4367b8a548a4c12837dcddd2ad010f75043af8c9"

RPROVIDES:${PN} += "libpnetcdf-1-12-3-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libopenmpi2-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
