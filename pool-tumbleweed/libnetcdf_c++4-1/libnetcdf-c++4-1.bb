SUMMARY = "C++ library for the Unidata network Common Data Form version 4"
DESCRIPTION = "NetCDF4 (network Common Data Form) is a set of software libraries and \
machine-independent data formats that support the creation, access, and sharing \
of array-oriented scientific data. \
 \
This package provides the C++ API."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf_c++4-1-4.3.1-6.4.aarch64.rpm"
RPM_HASH = "37b400df6887a48712b24d8126203b54e827b920eff5906118a209600f95a9ec9dfbf4d3162e95a19238b6dc08aee8b4bb6e583fbb333fa4dcc7aaa9fcb1217f"

RPROVIDES:${PN} += "libnetcdf-c++4-1 \
libnetcdf-c++4.so.1 \
libnetcdf1-/usr/lib64/libnetcdf-c++.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
