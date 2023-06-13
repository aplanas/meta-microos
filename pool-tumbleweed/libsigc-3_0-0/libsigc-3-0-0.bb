SUMMARY = "Typesafe Signal Framework for C++"
DESCRIPTION = "This library implements a full callback system for use in widget \
libraries, abstract interfaces, and general programming. It is the most \
complete library of its kind with the ability to connect an abstract \
callback to a class method, function, or function object. It contains \
adaptor classes for connection of dissimilar callbacks and has an ease \
of use unmatched by other C++ callback libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "3.2.0"

RPM_NAME = "libsigc-3_0-0-3.2.0-1.6.aarch64.rpm"
RPM_HASH = "fe615f665e6f0d2dded4aaa936f9ba494dfffa55d96b4977331487cbc3f3f8aea2247008bf761e8717799883119266675d77db6c3081db22f844a80dd013f0f0"

RPROVIDES:${PN} += "libsigc++3 \
libsigc-3.0.so.0()(64bit) \
libsigc-3_0-0 \
libsigc-3_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit)"

inherit rpm
