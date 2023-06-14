SUMMARY = "Old C++ library for for the Unidata network Common Data Form"
DESCRIPTION = "NetCDF (network Common Data Form) is a set of software libraries and \
machine-independent data formats that support the creation, access, and sharing \
of array-oriented scientific data. \
This package provides the old C++ API. It's not recommended for new projects, \
but it still works."
LICENSE = "NetCDF"

PV = "4.2"

RPM_NAME = "libnetcdf_c++4-4.2-8.31.aarch64.rpm"
RPM_HASH = "2ab91aee616850db71b09bcc15fa53d044dc50002388cb9aa471a36f3429900613e031f314c8ad5542d4a96787f5677aa690d542caa128d5d2c11bc2a0964149"

RPROVIDES:${PN} += "libnetcdf-c++.so.4 \
libnetcdf-c++4 \
libnetcdf4-/usr/lib64/libnetcdf-c++.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnetcdf.so.19 \
libstdc++.so.6"

inherit rpm
