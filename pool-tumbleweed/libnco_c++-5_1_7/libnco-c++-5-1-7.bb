SUMMARY = "Libraries for accessing nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains a C++ shared library for accessing HDF and \
netCDF files."
LICENSE = "BSD-3-Clause"

PV = "5.1.7"

RPM_NAME = "libnco_c++-5_1_7-5.1.7-1.1.aarch64.rpm"
RPM_HASH = "82d1a418dbf8267e4ba599d43068d8d744b98bfcdfc33b143abce96762b5205bb10fb69ae77576ddbfed1f1324e328bea0e24af6e39a2425f5009a35767cedbb"

RPROVIDES:${PN} += "libnco-c++ \
libnco-c++-5 \
libnco-c++-5-1-7 \
libnco-c++-5.1.7.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnetcdf.so.19 \
libstdc++.so.6"

inherit rpm
