SUMMARY = "Development files for netcdf_4_9_2-gnu-mvapich2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the mvapich2 version of all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-mvapich2-hpc-devel-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "fddfdf3d2d413ebffe0570cf83e6b644fe38a268e7d86d30f6e55d7f46c813669cc743b33e1d12aae458aec395c92690a725d6413b2945e0ef788291adab5f91"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-mvapich2-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libcurl.so.4 \
libm.so.6 \
libnetcdf-4-9-2-gnu-mvapich2-hpc \
libxml2.so.2 \
mvapich2-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
