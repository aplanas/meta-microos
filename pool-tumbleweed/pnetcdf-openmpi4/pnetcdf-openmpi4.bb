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

RPM_NAME = "pnetcdf-openmpi4-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "3cdc090c96b4551e1d8d5a12811555b43a52d9e7053bfc8001d56e1a534a43989118101bc4aff4b72f887e923e5f07eaf6b5e90441becd1d4d7e3c78a8d4c5a6"

RPROVIDES:${PN} += "parallel-netcdf-openmpi4 \
pnetcdf-openmpi4"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40 \
libpnetcdf.so.4 \
libpnetcdf4-openmpi4 \
openmpi4"

inherit rpm
