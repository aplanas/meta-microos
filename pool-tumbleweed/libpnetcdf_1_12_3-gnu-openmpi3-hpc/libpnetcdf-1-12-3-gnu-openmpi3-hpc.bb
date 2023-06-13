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

RPM_NAME = "libpnetcdf_1_12_3-gnu-openmpi3-hpc-1.12.3-1.2.aarch64.rpm"
RPM_HASH = "b7ab72276695ad2ef8f0c0e8cbcbe63d3d42c59ee5e4aab32420ad5ab5a4fb242087a742003af639134562f3a97b0ba2890421a62eebca385ce2b1246c51078c"

RPROVIDES:${PN} += "libpnetcdf_1_12_3-gnu-openmpi3-hpc \
libpnetcdf_1_12_3-gnu-openmpi3-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libopenmpi3-gnu-hpc \
libstdc++.so.6()(64bit) \
lua-lmod"

inherit rpm
