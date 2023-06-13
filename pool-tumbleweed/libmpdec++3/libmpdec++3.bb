SUMMARY = "C++ library for arbitrary precision decimal floating point arithmetic"
DESCRIPTION = "libmpdec++ is a C++ implementation of the General Decimal Arithmetic \
Specification. The specification defines a general purpose arbitrary \
precision data type together with rigorously specified functions and \
rounding behavior. libmpdec conforms - with minor restrictions - to \
the IEEE 754-2008 Standard for Floating-Point Arithmetic."
LICENSE = "BSD-2-Clause"

PV = "2.5.1"

RPM_NAME = "libmpdec++3-2.5.1-2.13.aarch64.rpm"
RPM_HASH = "eb196ac2add84ce12cf89e2af9b97e78feaa24480c621ed4b1941769f072766d84ddcc06068426e4af4a5536cc92208436a074df9f572d2289cd8695d0d2a83a"

RPROVIDES:${PN} += "libmpdec++.so.3()(64bit) \
libmpdec++3 \
libmpdec++3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmpdec.so.3()(64bit) \
libmpdec3 \
libstdc++.so.6()(64bit)"

inherit rpm
