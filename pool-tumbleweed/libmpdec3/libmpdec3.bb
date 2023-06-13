SUMMARY = "C library for arbitrary precision decimal floating point arithmetic"
DESCRIPTION = "libmpdec is a C implementation of the General Decimal Arithmetic \
Specification. The specification defines a general purpose arbitrary \
precision data type together with rigorously specified functions and \
rounding behavior. libmpdec conforms - with minor restrictions - to \
the IEEE 754-2008 Standard for Floating-Point Arithmetic."
LICENSE = "BSD-2-Clause"

PV = "2.5.1"

RPM_NAME = "libmpdec3-2.5.1-2.13.aarch64.rpm"
RPM_HASH = "c6a626ba382a8f89071dce10b99968db7fb616c0030aefcebd1acb80054730297f7590eb1c5279438726fd9f9388a493af000049f28601521baae493aee5d55a"

RPROVIDES:${PN} += "libmpdec.so.3()(64bit) \
libmpdec3 \
libmpdec3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
