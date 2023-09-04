SUMMARY = "A library for calculating huge numbers"
DESCRIPTION = "GMP is a library for arbitrary precision arithmetic, operating on \
signed integers, rational numbers, and floating-point numbers."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "6.3.0"

RPM_NAME = "libgmp10-6.3.0-1.1.aarch64.rpm"
RPM_HASH = "a8357bb5bcffb5633a625137e347a04ebd597bb4ba0751b0155f6af0d3b2ba32e89aa14eca0c17142c54a27becd2758b9158c3de186adf4acde81008e6af2905"

RPROVIDES:${PN} += "libgmp.so.10 \
libgmp10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
