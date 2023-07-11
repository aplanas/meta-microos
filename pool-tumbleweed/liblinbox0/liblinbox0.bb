SUMMARY = "C++ library for computation with matrices over ints and finite fields"
DESCRIPTION = "LinBox is a C++ template library for exact, high-performance linear \
algebra computation with dense, sparse, and structured matrices over \
the integers and over finite fields."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.0"

RPM_NAME = "liblinbox0-1.7.0-1.8.aarch64.rpm"
RPM_HASH = "fee9006731de22c2cbbbbec52b43462258c8b6fd2ba885e5bec2a428368131e21292e0c531df208eb2deae404f88de5b37cbcdb9346e504eb2bc3fbc8c66d860"

RPROVIDES:${PN} += "liblinbox.so.0 \
liblinbox0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libntl.so.44 \
libstdc++.so.6"

inherit rpm
