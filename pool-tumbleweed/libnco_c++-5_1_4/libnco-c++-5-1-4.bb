SUMMARY = "Libraries for accessing nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains a C++ shared library for accessing HDF and \
netCDF files."
LICENSE = "BSD-3-Clause"

PV = "5.1.4"

RPM_NAME = "libnco_c++-5_1_4-5.1.4-1.6.aarch64.rpm"
RPM_HASH = "6eab1e65b18ec03f8a1ccd5c4e9f12b23f8a8d4bb315e3d9e35f6ac2ecd759e5de92655218893fa6ad565919f73ce291495d34b48d1ad3bf1f9595c227cf5d9f"

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
