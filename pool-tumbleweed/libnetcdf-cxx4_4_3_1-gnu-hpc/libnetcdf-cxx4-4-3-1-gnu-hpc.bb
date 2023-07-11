SUMMARY = "C++ library for the Unidata network Common Data Form version 4"
DESCRIPTION = "NetCDF4 (network Common Data Form) is a set of software libraries and \
machine-independent data formats that support the creation, access, and sharing \
of array-oriented scientific data. \
 \
This package provides the C++ API."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf-cxx4_4_3_1-gnu-hpc-4.3.1-6.6.aarch64.rpm"
RPM_HASH = "a613b24a6410d09d493dbbbc7dfc682d24672fe7cab85b1f51cd1315c19ef2bd19911a23a275feb24eaf698110367a347ab8cf3902b93bd12490d8ce0f0fd810"

RPROVIDES:${PN} += "libnetcdf-cxx4-4-3-1-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnetcdf-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
