SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-openmpi3-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
the openmpi version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-openmpi3-hpc-devel-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "ae2edb88b0b2876879c31f875d6319444d14f7fd2cfc6f89654c35c2dacfb283115bace6f6aeec3d09d749d703c891dd2aabf31921c5bd68be86245f12707ef2"

RPROVIDES:${PN} += "netcdf-fortran-4-5-3-gnu-openmpi3-hpc \
netcdf-fortran-4-5-3-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libgfortran.so.5 \
libnetcdf-fortran-4-5-3-gnu-openmpi3-hpc \
netcdf-gnu-openmpi3-hpc-devel \
openmpi3-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
