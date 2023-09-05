SUMMARY = "C++ bindings for the GNU MP Library"
DESCRIPTION = "GMP is a library for arbitrary precision arithmetic, operating on \
signed integers, rational numbers, and floating-point numbers. \
 \
This package contains C++ bindings for the GNU MP Library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "6.3.0"

RPM_NAME = "libgmpxx4-6.3.0-2.1.aarch64.rpm"
RPM_HASH = "482b1440769f64ddba81438d5730cd3a13f95fb99cf2e8f6f4cd386e232437b0e547acacfae5b053f847ba17f9c8cb0fc05ba0327e1071736639a1a4f585835b"

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
