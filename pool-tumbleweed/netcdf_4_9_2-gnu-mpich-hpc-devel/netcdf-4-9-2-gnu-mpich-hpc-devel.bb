SUMMARY = "Development files for netcdf_4_9_2-gnu-mpich-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the mpich version of all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-mpich-hpc-devel-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "845aa25fabba8e716ce54274f48eb6ac90034086a31a13d2e4255dbf3af9b827c03505941206d5ecc0b5b5fc07ce979bc148aababf7bd87c2d1c0af985280449"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-mpich-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libcurl.so.4 \
libm.so.6 \
libnetcdf-4-9-2-gnu-mpich-hpc \
libxml2.so.2 \
mpich-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
