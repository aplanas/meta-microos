SUMMARY = "A library for calculating huge numbers"
DESCRIPTION = "GMP is a library for arbitrary precision arithmetic, operating on \
signed integers, rational numbers, and floating-point numbers."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "6.2.1"

RPM_NAME = "libgmp10-6.2.1-4.16.aarch64.rpm"
RPM_HASH = "41552563c79f841e095ff55752402f1deaa96d14f6709e2e076d6097113f029461f2dd67d4f1360d5cb61e3c3338e038a31364e0a81aacdedc1069e38ff29a57"

RPROVIDES:${PN} += "libgmp.so.10 \
libgmp10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
