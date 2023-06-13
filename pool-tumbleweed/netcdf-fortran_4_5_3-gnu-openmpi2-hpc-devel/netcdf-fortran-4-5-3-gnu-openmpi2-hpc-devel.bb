SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-openmpi2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
the openmpi version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-openmpi2-hpc-devel-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "eeffcc1bfedffce12c4a6d35e41528c5f637721e519ab6936d75b20c8a2f7541c6147ddc27e9e485904ed2a4e98cadc5c6cf0a910c9e1704b9593bd060b85764"

RPROVIDES:${PN} += "netcdf-fortran_4_5_3-gnu-openmpi2-hpc \
netcdf-fortran_4_5_3-gnu-openmpi2-hpc-devel \
netcdf-fortran_4_5_3-gnu-openmpi2-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcurl-devel \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libnetcdf-fortran_4_5_3-gnu-openmpi2-hpc \
netcdf-gnu-openmpi2-hpc-devel \
openmpi2-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
