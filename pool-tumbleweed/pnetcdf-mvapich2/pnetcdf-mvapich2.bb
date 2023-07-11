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

RPM_NAME = "pnetcdf-mvapich2-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "1ee9d926995e6a62115eb15e712072cfaf006a13b418fb4a21655a9d817fc63f122089f80913ae0e051fa961eb6ce6412ff9412d9199399eb1258847c3ee15fa"

RPROVIDES:${PN} += "parallel-netcdf-mvapich2 \
pnetcdf-mvapich2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12 \
libpnetcdf.so.4 \
libpnetcdf4-mvapich2 \
mvapich2"

inherit rpm
