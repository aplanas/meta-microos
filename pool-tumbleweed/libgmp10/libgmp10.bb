SUMMARY = "A library for calculating huge numbers"
DESCRIPTION = "GMP is a library for arbitrary precision arithmetic, operating on \
signed integers, rational numbers, and floating-point numbers."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "6.2.1"

RPM_NAME = "libgmp10-6.2.1-4.14.aarch64.rpm"
RPM_HASH = "055f9e308720f7aabaa5f1866c2c7e6dda016c94910738e28d56f4dbcb0746440a9a15c5b5ccf06aad36ce77c3d5b4c06e47b8b1b59575752c9e7fc66aff46fc"

RPROVIDES:${PN} += "libgmp.so.10()(64bit) \
libgmp10 \
libgmp10(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
