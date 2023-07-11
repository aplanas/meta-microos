SUMMARY = "Library for exact computation with real and complex numbers"
DESCRIPTION = "A C library for exact computation with real and complex numbers. \
 \
The basic idea behind Calcium is to represent numbers as elements of \
formal fields Q(a_1,…,a_n) where the extension numbers a_k can be \
algebraic or transcendental."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.1"

RPM_NAME = "libcalcium0-0.4.1-1.10.aarch64.rpm"
RPM_HASH = "da4b1ae1b6b15dcd93305d52c29a6d24cb422e45168a829869b6e2ccd13b42a30b7cb41ac49e6aec396a7ffd4d3878b89cc38aa39103681c0ee4121aefa75f25"

RPROVIDES:${PN} += "libcalcium.so.0 \
libcalcium0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libantic.so.0 \
libarb.so.2 \
libc.so.6 \
libflint.so.17 \
libgmp.so.10"

inherit rpm
