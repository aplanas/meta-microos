SUMMARY = "Development files for netcdf_4_9_2-gnu-openmpi2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi2 version of all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi2-hpc-devel-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "6b809271671e22cbe9fa2b53df52a272d72a0e7e2b49a078be1f83cf394d844ba4aa5789f1f2e98597ae97ed3ae8ef6f1391a6091be90fca9d8da6f47ffd6bc2"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
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
