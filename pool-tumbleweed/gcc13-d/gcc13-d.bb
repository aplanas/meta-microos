SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-d-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "4b894ed2307f12460703e2af40d91bf2a5c044895e6171ddd480016113846d66f33b10db25b9301ab41c9f7136129a844aaa70f8228926f7a4d3dc4db67184da"

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
