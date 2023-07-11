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

RPM_NAME = "libpnetcdf_1_12_3-gnu-openmpi3-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "2ecf14d461e681508175eb672290506df1682e3766ed218fe40beafd5d085e4f082127f801065bae2490a2552e6c164e63ab8554f8fee04ffafd518aa78c0f81"

RPROVIDES:${PN} += "libpnetcdf-1-12-3-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libopenmpi3-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
