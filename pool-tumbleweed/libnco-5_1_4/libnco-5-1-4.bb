SUMMARY = "Libraries for accessing nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains a shared library for accessing HDF and netCDF \
files."
LICENSE = "BSD-3-Clause"

PV = "5.1.4"

RPM_NAME = "libnco-5_1_4-5.1.4-1.4.aarch64.rpm"
RPM_HASH = "745d38c5d5fa161f59eb2a65a98a80435d2364b222e583e0a4df869fa64540807c0f3ff10d123a544836dc651b4bb8c2e45c6bf17c80cefe125bf57e6f9d27f9"

RPROVIDES:${PN} += "libnco \
libnco-5 \
libnco-5-1-4 \
libnco-5.1.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
libnetcdf.so.19 \
libudunits2.so.0"

inherit rpm
