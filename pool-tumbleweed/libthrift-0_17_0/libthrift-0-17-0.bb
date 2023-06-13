SUMMARY = "C++ API for the Thrift software framework"
DESCRIPTION = "Shared library providing the C++ API for the Thrift software framework. \
 \
Thrift is a software framework for scalable cross-language services \
development. It combines a software stack with a code generation \
engine to build services that work between C++, Java, C#, Python, \
Ruby, Perl, PHP, Objective C/Cocoa, Smalltalk, Erlang, Objective \
Caml, and Haskell."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "libthrift-0_17_0-0.17.0-1.6.aarch64.rpm"
RPM_HASH = "08446326da180ba615a1dc743abf70869e623df0278a5b22b261aa1b85c8dc8ed648a4a3f8b2e439d619626ab2b6c4a47a7694305afc94785029284f98abbafb"

RPROVIDES:${PN} += "libthrift-0.17.0.so()(64bit) \
libthrift-0_17_0 \
libthrift-0_17_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
