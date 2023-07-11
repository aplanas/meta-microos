SUMMARY = "Framework for scalable cross-language services development"
DESCRIPTION = "Thrift is a software framework for scalable cross-language services \
development. It combines a software stack with a code generation \
engine to build services that work between C++, Java, C#, Python, \
Ruby, Perl, PHP, Objective C/Cocoa, Smalltalk, Erlang, Objective \
Caml, and Haskell."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "thrift-0.17.0-1.9.aarch64.rpm"
RPM_HASH = "c6587e06bb8f3d566898877f726b9b2c07102f19005ab6cc6bbe979284acf5d52bc3185fd9994f540b13e2f7cf4f4e19303248ef3feeb57b6d316beda8757709"

RPROVIDES:${PN} += "thrift"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
