SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "gcc13-d-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "00f23ac31b1fafee0140b1241be5f423ec3e36cbd67ceb03272b21702f2209071a8507ae583bf4f29331dbc018ef0a35bdf154164e7bdc3c201ab63827f6723d"

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
