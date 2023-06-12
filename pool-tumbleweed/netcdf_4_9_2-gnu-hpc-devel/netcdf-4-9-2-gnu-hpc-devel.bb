SUMMARY = "Development files for netcdf_4_9_2-gnu-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-hpc-devel-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "19752f4fde69a45e75057f85bd475a2292db74215b4968c76d82f86c9c5a4bdf58afc06f543c39bfd94dfddb8affd9eec8e73992693a238962620e2727172c15"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-hpc-devel \
netcdf_4_9_2-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcurl-devel \
libcurl.so.4()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnetcdf_4_9_2-gnu-hpc \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
pkgconfig \
zlib-devel"

inherit rpm
