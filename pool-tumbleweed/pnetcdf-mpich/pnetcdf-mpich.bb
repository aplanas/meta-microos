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

RPM_NAME = "pnetcdf-mpich-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "aec39381b8a9a03029bc833601e1acc509bbefc3ba1aaf42dd1995e2f4803a8b9663f177ccc6aa0db991cbbf778e491bbeec015c8d80ba90f087e947f3dbdf03"

RPROVIDES:${PN} += "parallel-netcdf-mpich \
pnetcdf-mpich"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12 \
libpnetcdf.so.4 \
libpnetcdf4-mpich \
mpich"

inherit rpm
