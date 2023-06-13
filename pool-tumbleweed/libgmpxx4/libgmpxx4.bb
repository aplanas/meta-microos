SUMMARY = "C++ bindings for the GNU MP Library"
DESCRIPTION = "GMP is a library for arbitrary precision arithmetic, operating on \
signed integers, rational numbers, and floating-point numbers. \
 \
This package contains C++ bindings for the GNU MP Library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "6.2.1"

RPM_NAME = "libgmpxx4-6.2.1-4.14.aarch64.rpm"
RPM_HASH = "9910e2e5f5ed58c429481d5a64db1ada50bc19d862d93c187d5960ad1f24a5217e67bd3fbc7c0f63ed4c59506f6b4e5a0cb52eb0fea24273b181969f76516635"

RPROVIDES:${PN} += "libgmpxx.so.4()(64bit) \
libgmpxx4 \
libgmpxx4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libgmp10 \
libstdc++.so.6()(64bit)"

inherit rpm
