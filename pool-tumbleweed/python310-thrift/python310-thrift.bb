SUMMARY = "Python 3.10 bindings for the Thrift software framework"
DESCRIPTION = "Thrift Python 3.10 library \
 \
Thrift is a software framework for scalable cross-language services \
development. It combines a software stack with a code generation \
engine to build services that work between C++, Java, C#, Python, \
Ruby, Perl, PHP, Objective C/Cocoa, Smalltalk, Erlang, Objective \
Caml, and Haskell."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "python310-thrift-0.17.0-1.10.aarch64.rpm"
RPM_HASH = "61e9411e9168e61b47368a31c5fdec2de8ce2bafa53324ff1ee62407d1ccf8bdb0f8a40d4e26930b5201cca912dd37295e22593af7dd97a05b787c6ecd01b8f3"

RPROVIDES:${PN} += "python3.10dist-thrift \
python310-thrift \
python3dist-thrift"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python310-six"

inherit rpm
