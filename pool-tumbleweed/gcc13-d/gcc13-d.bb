SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-d-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "1d06524026439206240e54d958b0173a0a41478551e52218947e2c4aecc195fd3f57228536df77518a2362afc6730c6b6c81d14dd84818f8e67210a8b54c0976"

RPROVIDES:${PN} += "gcc13-d"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdruntime4 \
libgmp.so.10 \
libgphobos4 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
