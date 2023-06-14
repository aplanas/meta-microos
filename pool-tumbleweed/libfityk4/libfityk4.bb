SUMMARY = "Library for non-linear curve fitting and data analysis"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfityk4-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "26d0e4e37b2a23ac4a80d42b37400fe215616438b7397b59e8039abd83323a3c7d4edd34ab077ab46bcaaae85014eb7820a48f3b5963f33a5fbd8d8f5fc97aac"

RPROVIDES:${PN} += "libfityk.so.4 \
libfityk4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libnlopt.so.0 \
libstdc++.so.6 \
libxy.so.3 \
libz.so.1"

inherit rpm
