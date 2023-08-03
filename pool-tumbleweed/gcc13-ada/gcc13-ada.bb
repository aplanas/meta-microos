SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-ada-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "1876b0bbb063a7065e277bb663d022ddf931364c69f33b60f8ff8a6708602d35d56930abbd7cddd0bea380beecbb9e5997d145cdf2a14bba289051a8f802c65c"

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
