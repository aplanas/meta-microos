SUMMARY = "C++ library for computation with matrices over ints and finite fields"
DESCRIPTION = "LinBox is a C++ template library for exact, high-performance linear \
algebra computation with dense, sparse, and structured matrices over \
the integers and over finite fields."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.0"

RPM_NAME = "liblinbox0-1.7.0-1.7.aarch64.rpm"
RPM_HASH = "5c5c7c1944bd804d900405bb22d69f56af8e320269dfc5e68924856d3b7843b48d8d33cc1f6bc6a17ad4bd920b772b5299d5c90bdbe367b8a485b05241242a00"

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
