SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
Parallel netCDF (PnetCDF) is a library providing high-performance I/O while \
still maintaining file-format compatibility with NetCDF by Unidata. \
 \
This package contains the mvapich2 version of utility functions for \
working with NetCDF files."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-mvapich2-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "a3ccc606856b1e137d0de932ca5904e6072ab9e8c247107105dd1cc0d1d133529736043ff50606774d0b72a874de916f277101036c2d811652b3fbb49a6a6fb9"

RPROVIDES:${PN} += "pnetcdf_1_12_3-gnu-mvapich2-hpc \
pnetcdf_1_12_3-gnu-mvapich2-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpnetcdf_1_12_3-gnu-mvapich2-hpc"

inherit rpm
