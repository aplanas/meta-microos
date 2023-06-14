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

RPM_NAME = "pnetcdf-openmpi2-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "8e8bdb4e96e44682a48859b840aade5b6772393d5175493a49c103482bac2978fa847ea95a973b9bee0f86a2d71762117aebac9b7faa40a3a3ec4f25547eb2df"

RPROVIDES:${PN} += "parallel-netcdf-openmpi2 \
pnetcdf-openmpi2"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.20 \
libpnetcdf.so.4 \
libpnetcdf4-openmpi2 \
openmpi2"

inherit rpm
