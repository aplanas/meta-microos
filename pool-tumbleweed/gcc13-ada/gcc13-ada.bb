SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "gcc13-ada-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "5f2013af4a46c74809b0cfa99229e48494d2221792b67251497dd22a297eb194d977b7446e57e152d2d0a88f0b610221dc9a69023493337405b84f3f6cc02927"

RPROVIDES:${PN} += "gcc13-ada"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libada13 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
