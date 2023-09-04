SUMMARY = "Framework for scalable cross-language services development"
DESCRIPTION = "Thrift is a software framework for scalable cross-language services \
development. It combines a software stack with a code generation \
engine to build services that work between C++, Java, C#, Python, \
Ruby, Perl, PHP, Objective C/Cocoa, Smalltalk, Erlang, Objective \
Caml, and Haskell."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "thrift-0.17.0-1.10.aarch64.rpm"
RPM_HASH = "784dce6509825a7772fda26e0be9ed4438f7286fcd585c4fa8f34cae4db0a0905d0c50e5e5034982febad290dbe85ea589c9dbfd4d420d8391c98967c4cd681b"

RPROVIDES:${PN} += "thrift"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
