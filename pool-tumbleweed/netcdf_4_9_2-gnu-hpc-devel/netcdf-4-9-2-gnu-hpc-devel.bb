SUMMARY = "Development files for netcdf_4_9_2-gnu-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-hpc-devel-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "516fc9c71af22d7ac92e33e86ef20393d3d97667ea8e992c2c57734fbaea0b652d4e57577e76eafa7da5c2e9675d61d8bb3db2471c4f51a5432449e33c686e4a"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libcurl.so.4 \
libm.so.6 \
libnetcdf-4-9-2-gnu-hpc \
libxml2.so.2 \
pkgconfig \
zlib-devel"

inherit rpm
