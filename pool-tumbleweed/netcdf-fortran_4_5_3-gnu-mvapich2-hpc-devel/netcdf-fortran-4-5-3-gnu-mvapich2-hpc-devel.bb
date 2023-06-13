SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-mvapich2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
the mvapich2 version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-mvapich2-hpc-devel-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "cbca1de0483ec7ac21042bedcd0a46b214374cd1d0a0e404f34a59024281422295a9dfe642dc0c3c84323858a37f99525aa111c116094e7d3f3c2125ee2acaa4"

RPROVIDES:${PN} += "netcdf-fortran_4_5_3-gnu-mvapich2-hpc \
netcdf-fortran_4_5_3-gnu-mvapich2-hpc-devel \
netcdf-fortran_4_5_3-gnu-mvapich2-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl-devel \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libnetcdf-fortran_4_5_3-gnu-mvapich2-hpc \
mvapich2-gnu-hpc-devel \
netcdf-gnu-mvapich2-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
