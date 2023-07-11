SUMMARY = "Old C++ library for for the Unidata network Common Data Form"
DESCRIPTION = "NetCDF (network Common Data Form) is a set of software libraries and \
machine-independent data formats that support the creation, access, and sharing \
of array-oriented scientific data. \
This package provides the old C++ API. It's not recommended for new projects, \
but it still works."
LICENSE = "NetCDF"

PV = "4.2"

RPM_NAME = "libnetcdf_c++4-4.2-8.32.aarch64.rpm"
RPM_HASH = "9480acf50ff4107e2bfe0cad5b2d37234baa5e5f31a7c468a176d61d4407a74d75c83c4f685d3d24260b59a221e5c489fb00f2aa04c049f1e7ec913d7500e4f8"

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
