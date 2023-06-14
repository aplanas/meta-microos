SUMMARY = "Libraries for accessing nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains a C++ shared library for accessing HDF and \
netCDF files."
LICENSE = "BSD-3-Clause"

PV = "5.1.4"

RPM_NAME = "libnco_c++-5_1_4-5.1.4-1.4.aarch64.rpm"
RPM_HASH = "c2c75d2c8ee63d099127d1c50141c18be66a8bb059703ce254d1d334c26a6a7b34d5d9eb6f69abe703e78616a78807bfc6e115634b13047b260b090cbc107a4a"

RPROVIDES:${PN} += "libnco-c++ \
libnco-c++-5 \
libnco-c++-5-1-4 \
libnco-c++-5.1.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnetcdf.so.19 \
libstdc++.so.6"

inherit rpm
