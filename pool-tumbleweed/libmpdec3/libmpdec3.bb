SUMMARY = "C library for arbitrary precision decimal floating point arithmetic"
DESCRIPTION = "libmpdec is a C implementation of the General Decimal Arithmetic \
Specification. The specification defines a general purpose arbitrary \
precision data type together with rigorously specified functions and \
rounding behavior. libmpdec conforms - with minor restrictions - to \
the IEEE 754-2008 Standard for Floating-Point Arithmetic."
LICENSE = "BSD-2-Clause"

PV = "2.5.1"

RPM_NAME = "libmpdec3-2.5.1-2.14.aarch64.rpm"
RPM_HASH = "47620c44c3e2e5394e80d2b9c1385fdb2e7d527be62ce2fa2064721c0c1b54ba51e2ced4c87f407cac4a53ff20e0ddaf7a2ee601c901c30eced3b3474f4a2924"

RPROVIDES:${PN} += "libmpdec.so.3 \
libmpdec3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
