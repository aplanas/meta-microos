SUMMARY = "Framework for scalable cross-language services development"
DESCRIPTION = "Thrift is a software framework for scalable cross-language services \
development. It combines a software stack with a code generation \
engine to build services that work between C++, Java, C#, Python, \
Ruby, Perl, PHP, Objective C/Cocoa, Smalltalk, Erlang, Objective \
Caml, and Haskell."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "thrift-0.17.0-1.6.aarch64.rpm"
RPM_HASH = "4d15f98498bc2d8073087dbc462618a435e63c1327ba03e7d6a8dd90350c11ba1f93eb49257a607abcf6c6e40ab8da258def9e22700afd863b030add48cc02b0"

RPROVIDES:${PN} += "thrift"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
