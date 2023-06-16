SUMMARY = "Development files for netcdf_4_9_2-gnu-mvapich2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the mvapich2 version of all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-mvapich2-hpc-devel-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "800a8a46f776e27de15adfe91fa8d0a1482fa2dc8d2f6ab4afd0e48c910686e5c6779a369ac330f163e56128f841ec97d2d063d24fe0ac9b5095a7fcc37dc041"

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
