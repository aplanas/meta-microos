SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-openmpi2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
the openmpi version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-openmpi2-hpc-devel-4.5.3-4.6.aarch64.rpm"
RPM_HASH = "40ff7246c6e3f4047b5b7907fefb54f4eabc2745526da6899b083b3d0a0e924d09858c866fd21faa94256511d38eaf8cd27b92c7a113e7fe2dddaa896792159c"

RPROVIDES:${PN} += "netcdf-fortran-4-5-3-gnu-openmpi2-hpc \
netcdf-fortran-4-5-3-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libgfortran.so.5 \
libnetcdf-fortran-4-5-3-gnu-openmpi2-hpc \
netcdf-gnu-openmpi2-hpc-devel \
openmpi2-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
