SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-openmpi4-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
the openmpi version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-openmpi4-hpc-devel-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "ef31d171c106f76128514e979c0212a7b19d80c6b260c8be53558d217be0ec7f6bd0a5b82b92f316b69a48f2594ff0f7660a18331b71f56732cc84977e4489c4"

RPROVIDES:${PN} += "netcdf-fortran-4-5-3-gnu-openmpi4-hpc \
netcdf-fortran-4-5-3-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libgfortran.so.5 \
libnetcdf-fortran-4-5-3-gnu-openmpi4-hpc \
netcdf-gnu-openmpi4-hpc-devel \
openmpi4-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
