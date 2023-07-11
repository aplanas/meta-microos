SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-d-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "a75ce36eba58b838adf298f07c3a9adf359f7bf7c804db60f362952ff8673bd2f5d0196fe64956e807816c137e29e65a59090e37e79f8f05fd6d2d39245cd8af"

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
