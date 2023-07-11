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

RPM_NAME = "pnetcdf-openmpi1-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "88e58944a7f1dfba402a3fcc46af38c5576de9e355cd1f4a2bb84ae693b58e17021e403ec5bab8f5858a771c0738cb9bc6bb0e9fdb788c9b827475b84ae844bb"

RPROVIDES:${PN} += "parallel-netcdf-openmpi1 \
pnetcdf-openmpi1"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12 \
libpnetcdf.so.4 \
libpnetcdf4-openmpi1 \
openmpi1"

inherit rpm
