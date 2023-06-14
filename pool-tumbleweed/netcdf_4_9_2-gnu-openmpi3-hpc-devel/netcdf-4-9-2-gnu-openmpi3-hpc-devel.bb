SUMMARY = "Development files for netcdf_4_9_2-gnu-openmpi3-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi3 version of all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi3-hpc-devel-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "e9d8bf7bcca89c7abf902316ca6b1b05d7e756ecb70a31b463290521d049b3aee243676c8b5f944ba09914760ba87b83f62379d6638c3d743f5cc8306d1da5be"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi3-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libcurl.so.4 \
libm.so.6 \
libnetcdf-4-9-2-gnu-openmpi3-hpc \
libxml2.so.2 \
openmpi3-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
