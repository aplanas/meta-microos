SUMMARY = "C++ library for the Unidata network Common Data Form version 4"
DESCRIPTION = "NetCDF4 (network Common Data Form) is a set of software libraries and \
machine-independent data formats that support the creation, access, and sharing \
of array-oriented scientific data. \
 \
This package provides the C++ API."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf_c++4-1-4.3.1-6.3.aarch64.rpm"
RPM_HASH = "c8e19a2280f50e21d785ebf397edecdbd043e89f9873b7389e8b4068afcd416279648c526862a380915ee5c1006eab1d7a7381971f0cb90a7987a3066b8792e9"

RPROVIDES:${PN} += "libnetcdf-c++4-1 \
libnetcdf-c++4.so.1 \
libnetcdf1-/usr/lib64/libnetcdf-c++.so.1"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
