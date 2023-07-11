SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-mpich-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
the mpich version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-mpich-hpc-devel-4.5.3-4.6.aarch64.rpm"
RPM_HASH = "80c2bf9792d87448c755ae2471f7282558bdbed66b1bd8acf0792efd18b5b228bf07ed0ac1ef9e5cedc971f08301f80e9529fddbef6b483b5692f8770de9f8cc"

RPROVIDES:${PN} += "netcdf-fortran-4-5-3-gnu-mpich-hpc \
netcdf-fortran-4-5-3-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libgfortran.so.5 \
libnetcdf-fortran-4-5-3-gnu-mpich-hpc \
mpich-gnu-hpc-devel \
netcdf-gnu-mpich-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
