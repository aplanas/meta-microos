SUMMARY = "Python 3.11 bindings for the Thrift software framework"
DESCRIPTION = "Thrift Python 3.11 library \
 \
Thrift is a software framework for scalable cross-language services \
development. It combines a software stack with a code generation \
engine to build services that work between C++, Java, C#, Python, \
Ruby, Perl, PHP, Objective C/Cocoa, Smalltalk, Erlang, Objective \
Caml, and Haskell."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "python311-thrift-0.17.0-1.9.aarch64.rpm"
RPM_HASH = "96e74634320d5dc5fd492f70b428c9db7cb9c4add8d497d9a505534037ff48ca14fa4fdd4b13ea0e49588ee13cf9421d66170dcfdbb15087d23b335867304cb8"

RPROVIDES:${PN} += "python3-thrift \
python3.11dist-thrift \
python311-thrift \
python3dist-thrift"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python311-six"

inherit rpm
