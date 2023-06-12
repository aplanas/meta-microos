SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-mpich-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
the mpich version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-mpich-hpc-devel-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "20422da7bd8c52e817bf698e8d4418b8b7309eac6d9705281e560486e1eef9be39e514c78bdd7ed85c16279819f2ee755eec7edce992c7744d55b719747fc4ef"

RPROVIDES:${PN} += "netcdf-fortran_4_5_3-gnu-mpich-hpc \
netcdf-fortran_4_5_3-gnu-mpich-hpc-devel \
netcdf-fortran_4_5_3-gnu-mpich-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcurl-devel \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libnetcdf-fortran_4_5_3-gnu-mpich-hpc \
mpich-gnu-hpc-devel \
netcdf-gnu-mpich-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
