SUMMARY = "Fixed-point math operations library"
DESCRIPTION = "fixmath is a fixed-point math operations library written in C and \
implementing the Q16.16 format."
LICENSE = "MIT"

PV = "2022.07.20"

RPM_NAME = "fixmath-2022.07.20-5.1.aarch64.rpm"
RPM_HASH = "5429d3ae6673347e8654fa0d99c6244aaa1589e2c6ad58e438dafe8ec435e560386762d3eb78129141530d591e9a2e67b05e39b156983dc600b4e3abfb95d893"

RPROVIDES:${PN} += "fixmath \
fixmath(aarch-64) \
libfixmath.so()(64bit) \
libfixmath.so(FIXMATH_2022.07.20)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
