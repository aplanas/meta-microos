SUMMARY = "Library for non-linear curve fitting and data analysis"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfityk4-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "82fa179971c7cb00e2042698fa9ce059eaade2cc4415d20ea7739784f922dd6cc7ac4b32c35829fe90f3749927222d1674083edceab1bd5513b7a06d33258ec3"

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
