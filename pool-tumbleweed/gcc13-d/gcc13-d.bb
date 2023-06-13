SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-d-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "4b894ed2307f12460703e2af40d91bf2a5c044895e6171ddd480016113846d66f33b10db25b9301ab41c9f7136129a844aaa70f8228926f7a4d3dc4db67184da"

RPROVIDES:${PN} += "gcc13-d \
gcc13-d(aarch-64)"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libgdruntime4 \
libgmp.so.10()(64bit) \
libgphobos4 \
libisl.so.23()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
