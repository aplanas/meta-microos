SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mpich version of the PnetCDF runtime \
libraries."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf_1_12_3-gnu-mpich-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "c1ca31a1a7033ad9e5460d1f144932f5585d60415d5e3d5a20583443edcac7a8367e8d3eec8ebc91c7a159d8c622b27879e8c0951337f468612ae8ed61139e94"

RPROVIDES:${PN} += "libpnetcdf-1-12-3-gnu-mpich-hpc"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libstdc++.so.6 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
