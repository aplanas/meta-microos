SUMMARY = "Development files for netcdf_4_9_2-gnu-openmpi1-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi1 version of all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi1-hpc-devel-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "ab2196d4ccaab45bdd717577b579f061cc0d15a0a06a711de5842259c0c3f49c23d9e791cff1abe20d559daf9fd7197d6512b759c5501bf1dfb12e899c5ba0c3"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi1-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libcurl.so.4 \
libm.so.6 \
libnetcdf-4-9-2-gnu-openmpi1-hpc \
libxml2.so.2 \
openmpi1-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
