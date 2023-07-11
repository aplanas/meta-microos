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

RPM_NAME = "libthrift-0_17_0-0.17.0-1.9.aarch64.rpm"
RPM_HASH = "04baff80f67ef35dab6638c616499987e9e24c95abc34ac96ad981a0ab3afadcac97261e5bba87340f15a78bac2bf335b389c4fffea0b8fcc9cb0cb204b98da1"

RPROVIDES:${PN} += "libthrift-0-17-0 \
libthrift-0.17.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
