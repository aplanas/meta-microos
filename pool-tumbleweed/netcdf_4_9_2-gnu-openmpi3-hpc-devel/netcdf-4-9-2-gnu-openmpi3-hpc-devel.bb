SUMMARY = "Development files for netcdf_4_9_2-gnu-openmpi3-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi3 version of all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi3-hpc-devel-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "6c07355cb2d9f2d6cea67831a9d08845170ed24007e45cd8cbfc94e2f6d1c2b33fe459dcdf59c04d18ef6050b6839a988bc6f9fe7358ed66da5afea976b43b00"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi3-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libcurl.so.4 \
libm.so.6 \
libnetcdf-4-9-2-gnu-openmpi3-hpc \
libxml2.so.2 \
openmpi3-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
