SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
 NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-hpc-devel-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "724c03f1767b3b4d03d1d22a97b7be55da2599628bb0702ccb42aec02a95924e3795d81e8ac14cafa5d919dbb208c8d8200dd1b105a91725768e021313726197"

RPROVIDES:${PN} += "netcdf-fortran_4_5_3-gnu-hpc \
netcdf-fortran_4_5_3-gnu-hpc-devel \
netcdf-fortran_4_5_3-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcurl-devel \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libnetcdf-fortran_4_5_3-gnu-hpc \
netcdf-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm