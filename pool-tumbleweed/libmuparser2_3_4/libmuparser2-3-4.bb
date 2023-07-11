SUMMARY = "Library to evaluate strings as mathematical functions"
DESCRIPTION = "muParser is an extensible math parser library written in C++. It \
works by transforming a mathematical expression into bytecode and \
precalculating constant parts of the expression."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "libmuparser2_3_4-2.3.4-1.4.aarch64.rpm"
RPM_HASH = "503b1521fc3e7a497bb5754406db5b5c55f361770b6f616d597dcf725211164aab3845ddda5813fb0892cffee7d503c37082015c6bfaf9a2b384ae122b796541"

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
