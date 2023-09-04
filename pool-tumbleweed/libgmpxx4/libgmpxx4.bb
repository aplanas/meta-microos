SUMMARY = "C++ bindings for the GNU MP Library"
DESCRIPTION = "GMP is a library for arbitrary precision arithmetic, operating on \
signed integers, rational numbers, and floating-point numbers. \
 \
This package contains C++ bindings for the GNU MP Library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "6.3.0"

RPM_NAME = "libgmpxx4-6.3.0-1.1.aarch64.rpm"
RPM_HASH = "e281026502e01150dee2fdab9deda0ae80157f40cd347d7c2783c2fe70064aada4fd5e95b36ece9a64f6be2280d42316f134d22e83290548e1a029277cd0e083"

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
