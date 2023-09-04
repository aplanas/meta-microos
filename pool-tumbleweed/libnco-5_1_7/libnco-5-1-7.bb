SUMMARY = "Libraries for accessing nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains a shared library for accessing HDF and netCDF \
files."
LICENSE = "BSD-3-Clause"

PV = "5.1.7"

RPM_NAME = "libnco-5_1_7-5.1.7-1.1.aarch64.rpm"
RPM_HASH = "48012e87fc6e7976cfe6c08ab80ac53302ccd9bf5ee8e1f6a1b118a5e022bcc78ee6691e099376d12bd0e9bbe16b951a6b2a4377b8e0c8e0190336eea8b3274c"

RPROVIDES:${PN} += "libnco \
libnco-5 \
libnco-5-1-7 \
libnco-5.1.7.so"

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
