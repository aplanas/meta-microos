SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-mvapich2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
the mvapich2 version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-mvapich2-hpc-devel-4.5.3-4.6.aarch64.rpm"
RPM_HASH = "3bc7935885005cf5b862306df2bc7e0797ff03b7715994e25934679ba0ff1eca40d012a87872cc50258f58d57f2fa40d6642f827822b7485f7c509daf846f467"

RPROVIDES:${PN} += "netcdf-fortran-4-5-3-gnu-mvapich2-hpc \
netcdf-fortran-4-5-3-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libgfortran.so.5 \
libnetcdf-fortran-4-5-3-gnu-mvapich2-hpc \
mvapich2-gnu-hpc-devel \
netcdf-gnu-mvapich2-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
