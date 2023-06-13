SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi2 version of utility functions for working with NetCDF files."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi2-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "ba7c4d25e63a2c6e6ef917320a71361447f129355ab7efb33a0580c6051eeb3fe5528d803ced3316c600c4d3f4da5ee7f17d24ffe2ef0b5aa7cbcc306b2f8128"

RPROVIDES:${PN} += "netcdf-openmpi2 \
netcdf-openmpi2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libhdf5.so.200()(64bit) \
libnetcdf.so.19()(64bit) \
libnetcdf19-openmpi2"

inherit rpm
