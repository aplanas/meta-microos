SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
 NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-hpc-devel-4.5.3-4.6.aarch64.rpm"
RPM_HASH = "70aa25dee2ec3d629a20a0649cdfa695fe76189aadf4dd95607b9f772515b1ae8ef97f95babd12a3c9350a993aca58860279f63bd86ce1bd2cd4ae767c6db7b9"

RPROVIDES:${PN} += "netcdf-fortran-4-5-3-gnu-hpc \
netcdf-fortran-4-5-3-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libgfortran.so.5 \
libnetcdf-fortran-4-5-3-gnu-hpc \
netcdf-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
