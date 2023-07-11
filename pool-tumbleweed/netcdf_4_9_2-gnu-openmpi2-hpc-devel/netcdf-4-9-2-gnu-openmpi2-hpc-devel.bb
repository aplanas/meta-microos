SUMMARY = "Development files for netcdf_4_9_2-gnu-openmpi2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi2 version of all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi2-hpc-devel-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "a48c7ac01df199883ade6744525e5a6dec42cfb606fe733895e3f5fc82d4c6881cab862768f94aa746acf3b9f789ce9399f8084f484b58f493133e46239e4443"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi2-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libcurl.so.4 \
libm.so.6 \
libnetcdf-4-9-2-gnu-openmpi2-hpc \
libxml2.so.2 \
openmpi2-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
