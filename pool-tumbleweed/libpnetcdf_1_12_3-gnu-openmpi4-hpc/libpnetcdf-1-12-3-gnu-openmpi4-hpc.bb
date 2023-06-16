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

RPM_NAME = "libpnetcdf_1_12_3-gnu-openmpi4-hpc-1.12.3-1.2.aarch64.rpm"
RPM_HASH = "7f18a81a581c2b3c8d16f1811788e708957056878e7d3d0a5cf55fd8bb8558e00576ce117ba0613422914479fec28b0ce3c867fd0744cbf3c323609c20c739ca"

RPROVIDES:${PN} += "libpnetcdf-1-12-3-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libopenmpi4-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
