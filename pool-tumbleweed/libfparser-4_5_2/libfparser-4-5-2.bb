SUMMARY = "Library to evaluate strings as mathematical functions"
DESCRIPTION = "This C++ library offers a class which can be used to parse and \
evaluate a mathematical function from a string (which might be e.g. \
requested from the user). The syntax of the function string is \
similar to mathematical expressions written in C/C++ (the exact \
syntax is specified later in this document). The function can then be \
evaluated with different values of variables."
LICENSE = "LGPL-3.0"

PV = "4.5.2"

RPM_NAME = "libfparser-4_5_2-4.5.2-1.32.aarch64.rpm"
RPM_HASH = "0a961d2822038b01e26cc8165d5740563c3fa0c837225018117a631a8da68a071dcade76542bd02773f7595a05177d522a5dddf457599781339d164a0b8a262b"

RPROVIDES:${PN} += "libfparser-4-5-2 \
libfparser-4.5.2.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
