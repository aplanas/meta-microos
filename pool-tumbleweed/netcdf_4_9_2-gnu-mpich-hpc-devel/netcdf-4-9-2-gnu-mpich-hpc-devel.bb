SUMMARY = "Development files for netcdf_4_9_2-gnu-mpich-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the mpich version of all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-mpich-hpc-devel-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "caca2aded3a8f92393aa44e480b8d73631238a519ff1ba55179017395fd92c253a2180206c2cd6815eb4c251397f902c6d70847842810b644f8729341b1cff21"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-mpich-hpc-devel \
netcdf_4_9_2-gnu-mpich-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-mpich-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcurl-devel \
libcurl.so.4()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnetcdf_4_9_2-gnu-mpich-hpc \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
mpich-gnu-hpc-devel \
pkgconfig \
zlib-devel"

inherit rpm
