SUMMARY = "Development files for netcdf_4_9_2-gnu-openmpi1-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi1 version of all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi1-hpc-devel-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "faeba3b521b9afbb5c72989331392a21ac5b66750081db9c2112f489542dd3dca8f52b5ff93007e433015891d197cec715d724d19a3bfacf843eeb7fca9cea11"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-openmpi1-hpc-devel \
netcdf_4_9_2-gnu-openmpi1-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi1-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl-devel \
libcurl.so.4()(64bit) \
libm.so.6()(64bit) \
libnetcdf_4_9_2-gnu-openmpi1-hpc \
libxml2.so.2()(64bit) \
openmpi1-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
