SUMMARY = "C++ library for arbitrary precision decimal floating point arithmetic"
DESCRIPTION = "libmpdec++ is a C++ implementation of the General Decimal Arithmetic \
Specification. The specification defines a general purpose arbitrary \
precision data type together with rigorously specified functions and \
rounding behavior. libmpdec conforms - with minor restrictions - to \
the IEEE 754-2008 Standard for Floating-Point Arithmetic."
LICENSE = "BSD-2-Clause"

PV = "2.5.1"

RPM_NAME = "libmpdec++3-2.5.1-2.14.aarch64.rpm"
RPM_HASH = "eccfdef0a03c5d5e921113304e7f8ebe08cf0de731f1f7b7d784544324f6f4bac8873cc59f836797db7027c711e2b603ba5fa709c347afde9aa197b9508061a1"

RPROVIDES:${PN} += "libmpdec++.so.3 \
libmpdec++3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpdec.so.3 \
libmpdec3 \
libstdc++.so.6"

inherit rpm
