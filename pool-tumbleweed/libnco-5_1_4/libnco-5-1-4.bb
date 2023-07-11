SUMMARY = "Libraries for accessing nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains a shared library for accessing HDF and netCDF \
files."
LICENSE = "BSD-3-Clause"

PV = "5.1.4"

RPM_NAME = "libnco-5_1_4-5.1.4-1.6.aarch64.rpm"
RPM_HASH = "3166efcd9ade0e5d099ad2c092511290a6ac166278e05898b8de4ed7aed083140f060816aa1068f7d170abcf723b1c55b388423a75f8c81a747b6bf87c68eaac"

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
