SUMMARY = "Development files for netcdf_4_9_2-gnu-openmpi4-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi4-hpc-devel-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "1e9ee9eb3659e3872b1170a84b678560f5bce433cf91bc89ecebf1951a0431eaa24947910fdc281eb860d49cf0d3f60ccd699a73338951035e4b39c6f12beeca"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
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
