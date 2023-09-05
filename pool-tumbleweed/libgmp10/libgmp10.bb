SUMMARY = "A library for calculating huge numbers"
DESCRIPTION = "GMP is a library for arbitrary precision arithmetic, operating on \
signed integers, rational numbers, and floating-point numbers."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "6.3.0"

RPM_NAME = "libgmp10-6.3.0-2.1.aarch64.rpm"
RPM_HASH = "dd1a2c03e26c60cd5309f623a58c780c7da3fb02f93287b680095154c88d94cf0e25b0f592745ba1b94bb7ef3f2f529772161c791214c9412755d9fbc2e1c3bb"

RPROVIDES:${PN} += "libgmp.so.10 \
libgmp10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
