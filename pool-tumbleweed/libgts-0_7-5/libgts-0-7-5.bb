SUMMARY = "GTS Runtime Library"
DESCRIPTION = "This package provides the GTS runtime library."
LICENSE = "LGPL-2.0+"

PV = "0.7.6_p20121130"

RPM_NAME = "libgts-0_7-5-0.7.6_p20121130-4.30.aarch64.rpm"
RPM_HASH = "962947c06d8bb3ed86a221c8b6c4c869ebdaa93e1485abafed225c4538827983e62c1551a0b006b78794ff839e92e9e235424a64ed179cc6503deba7f02400eb"

RPROVIDES:${PN} += "libgts-0-7-5 \
libgts-0.7.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
