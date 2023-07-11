SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
Parallel netCDF (PnetCDF) is a library providing high-performance I/O while \
still maintaining file-format compatibility with NetCDF by Unidata. \
 \
This package contains the mpich version of utility functions for \
working with NetCDF files."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-mpich-hpc-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "5159561f50a5edd914853fb123a2f53daf7b185784e03cfbc0229272bc0b45d0fb7180a888a5bbc3e0163dcb9d823c4f9bde6b73f9d8c33a2131cd1f91d7f551"

RPROVIDES:${PN} += "pnetcdf-1-12-3-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpnetcdf-1-12-3-gnu-mpich-hpc"

inherit rpm
