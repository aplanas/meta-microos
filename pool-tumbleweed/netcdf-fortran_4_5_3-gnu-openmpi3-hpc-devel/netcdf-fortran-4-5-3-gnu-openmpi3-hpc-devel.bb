SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-openmpi3-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
the openmpi version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-openmpi3-hpc-devel-4.5.3-4.4.aarch64.rpm"
RPM_HASH = "77e392366bc7b3cc9ef07ad41d586008eb78ba89d2ebd427edecc1a7d6789682dd08576890c737e332b06bfc36aa17f58ffe93c6ac6e8bdc5cb1c2c11088c083"

RPROVIDES:${PN} += "netcdf-fortran_4_5_3-gnu-openmpi3-hpc \
netcdf-fortran_4_5_3-gnu-openmpi3-hpc-devel \
netcdf-fortran_4_5_3-gnu-openmpi3-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcurl-devel \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libnetcdf-fortran_4_5_3-gnu-openmpi3-hpc \
netcdf-gnu-openmpi3-hpc-devel \
openmpi3-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
