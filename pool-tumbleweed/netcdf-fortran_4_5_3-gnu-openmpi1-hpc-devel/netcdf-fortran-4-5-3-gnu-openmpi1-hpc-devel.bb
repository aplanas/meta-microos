SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-openmpi1-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
the openmpi version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-openmpi1-hpc-devel-4.5.3-4.6.aarch64.rpm"
RPM_HASH = "8784a12df0fb40c7224cd3e99de61c2403031f07c4a1fc3f683a4d23b9ae6bb08c02586b767124de74f7ca6ab3611d914ea0eb57288156b21005bc6a3f5d664d"

RPROVIDES:${PN} += "netcdf-fortran-4-5-3-gnu-openmpi1-hpc \
netcdf-fortran-4-5-3-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libgfortran.so.5 \
libnetcdf-fortran-4-5-3-gnu-openmpi1-hpc \
netcdf-gnu-openmpi1-hpc-devel \
openmpi1-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
