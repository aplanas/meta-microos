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

RPM_NAME = "libthrift-0_17_0-0.17.0-1.10.aarch64.rpm"
RPM_HASH = "2e3815e2e402dcaa5cfb520c58d3e72c5f35d1173bbcfe060045722a3065af88544abcf93c7dbe39ab14e578e7a7aef5ae0d690f0d44bb89a9a799b26916d942"

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
