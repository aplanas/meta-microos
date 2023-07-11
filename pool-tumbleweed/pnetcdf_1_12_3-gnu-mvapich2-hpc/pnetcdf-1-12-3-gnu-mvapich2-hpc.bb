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

RPM_NAME = "pnetcdf_1_12_3-gnu-mvapich2-hpc-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "42bea93d0861e2cd90e1564246d5ff5c38be8fb110e3e474932d54bd74994bab542de5d04e06e8a12fa8fcfdd0968d96298fa629da9e84d404b3a343465fd262"

RPROVIDES:${PN} += "pnetcdf-1-12-3-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpnetcdf-1-12-3-gnu-mvapich2-hpc"

inherit rpm
