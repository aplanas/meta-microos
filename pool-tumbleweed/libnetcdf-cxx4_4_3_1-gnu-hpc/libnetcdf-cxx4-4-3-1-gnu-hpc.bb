SUMMARY = "C++ library for the Unidata network Common Data Form version 4"
DESCRIPTION = "NetCDF4 (network Common Data Form) is a set of software libraries and \
machine-independent data formats that support the creation, access, and sharing \
of array-oriented scientific data. \
 \
This package provides the C++ API."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf-cxx4_4_3_1-gnu-hpc-4.3.1-6.5.aarch64.rpm"
RPM_HASH = "fa54d7880fdf456de4e7617951260aced76cf24aeb02fffb67e507df9e90e5e432d8ec9320f3d33e0c52eb935134f8caedd2224588f11f6b7f0ad5e92c658d06"

RPROVIDES:${PN} += "libnetcdf-cxx4-4-3-1-gnu-hpc"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnetcdf-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
