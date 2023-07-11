SUMMARY = "C++ bindings for the GNU MP Library"
DESCRIPTION = "GMP is a library for arbitrary precision arithmetic, operating on \
signed integers, rational numbers, and floating-point numbers. \
 \
This package contains C++ bindings for the GNU MP Library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "6.2.1"

RPM_NAME = "libgmpxx4-6.2.1-4.16.aarch64.rpm"
RPM_HASH = "ac5e6c5085d110b2158b8641421b5ca0079fe9e709a15920ea16c4a8ec85bb7b26880ef929357c6388988b2cc1a789ba6bd40b09309b84e60cce8f21109c03fd"

RPROVIDES:${PN} += "libgmpxx.so.4 \
libgmpxx4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmp10 \
libstdc++.so.6"

inherit rpm
