SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-openmpi4-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
the openmpi version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-openmpi4-hpc-devel-4.5.3-4.4.aarch64.rpm"
RPM_HASH = "8d413a5f9196c5c6b06924853a05d3c5b64a73ed2d4578c7d6c3063ee7949e287ed7afc6b76448095e6ca29754c66399689351f11f19ff69a1cf196e724b3e7a"

RPROVIDES:${PN} += "netcdf-fortran_4_5_3-gnu-openmpi4-hpc \
netcdf-fortran_4_5_3-gnu-openmpi4-hpc-devel \
netcdf-fortran_4_5_3-gnu-openmpi4-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl-devel \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libnetcdf-fortran_4_5_3-gnu-openmpi4-hpc \
netcdf-gnu-openmpi4-hpc-devel \
openmpi4-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
