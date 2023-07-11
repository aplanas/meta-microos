SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
Parallel netCDF (PnetCDF) is a library providing high-performance I/O while \
still maintaining file-format compatibility with NetCDF by Unidata. \
 \
This package contains the openmpi version of utility functions for \
working with NetCDF files."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi2-hpc-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "05834dc110a97ea43fc36ecb1fa6a0c63b5166e86451d164954c564bc1f0aded9ca34c02ca336af302e22d461d760d5d8a4b31b9e2c22267015abb93ffeaa780"

RPROVIDES:${PN} += "pnetcdf-1-12-3-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpnetcdf-1-12-3-gnu-openmpi2-hpc"

inherit rpm
