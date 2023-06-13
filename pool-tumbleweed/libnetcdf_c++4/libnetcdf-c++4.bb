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

RPROVIDES:${PN} += "libnetcdf4:/usr/lib64/libnetcdf_c++.so.4 \
libnetcdf_c++.so.4()(64bit) \
libnetcdf_c++4 \
libnetcdf_c++4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libnetcdf.so.19()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
