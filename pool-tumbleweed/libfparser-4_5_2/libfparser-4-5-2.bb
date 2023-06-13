SUMMARY = "Library to evaluate strings as mathematical functions"
DESCRIPTION = "This C++ library offers a class which can be used to parse and \
evaluate a mathematical function from a string (which might be e.g. \
requested from the user). The syntax of the function string is \
similar to mathematical expressions written in C/C++ (the exact \
syntax is specified later in this document). The function can then be \
evaluated with different values of variables."
LICENSE = "LGPL-3.0"

PV = "4.5.2"

RPM_NAME = "libfparser-4_5_2-4.5.2-1.31.aarch64.rpm"
RPM_HASH = "5383a4f3e34b506683e0d0e3379cc61c7fee252eed45c8209e9ad4f26c812042f97be978b8092f006c455721c94d8f04ff1efea0a26430f95c988b73bbb29923"

RPROVIDES:${PN} += "libfparser-4.5.2.so()(64bit) \
libfparser-4_5_2 \
libfparser-4_5_2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libmpfr.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
