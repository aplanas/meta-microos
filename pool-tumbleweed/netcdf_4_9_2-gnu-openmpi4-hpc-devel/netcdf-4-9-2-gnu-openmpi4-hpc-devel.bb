SUMMARY = "Development files for netcdf_4_9_2-gnu-openmpi4-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi4-hpc-devel-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "459c2232f3e399bbb36e86097b42fd177f38ef70f40b36001eb96f1e983cc792fb6fd1390e2d48036657ec814df4a8e3b41d82a3e5e065c9e4925befe2b23dbb"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi4-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl-devel \
libcurl.so.4 \
libm.so.6 \
libnetcdf-4-9-2-gnu-openmpi4-hpc \
libxml2.so.2 \
openmpi4-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
