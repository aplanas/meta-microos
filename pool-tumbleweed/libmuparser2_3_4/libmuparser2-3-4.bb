SUMMARY = "Library to evaluate strings as mathematical functions"
DESCRIPTION = "muParser is an extensible math parser library written in C++. It \
works by transforming a mathematical expression into bytecode and \
precalculating constant parts of the expression."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "libmuparser2_3_4-2.3.4-1.3.aarch64.rpm"
RPM_HASH = "c631ab87637e8d76bfc15aa48099fcf8714c6f331ee825bcd5116bca5e2bf2d8ea717ce47dbba5a24e15f92bec35f63a07002f58b70219eec9bff2bda67718a9"

RPROVIDES:${PN} += "libmuparser.so.2.3.4 \
libmuparser2-3-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
