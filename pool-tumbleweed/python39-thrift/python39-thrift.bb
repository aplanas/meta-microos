SUMMARY = "Python 3.9 bindings for the Thrift software framework"
DESCRIPTION = "Thrift Python 3.9 library \
 \
Thrift is a software framework for scalable cross-language services \
development. It combines a software stack with a code generation \
engine to build services that work between C++, Java, C#, Python, \
Ruby, Perl, PHP, Objective C/Cocoa, Smalltalk, Erlang, Objective \
Caml, and Haskell."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "python39-thrift-0.17.0-1.10.aarch64.rpm"
RPM_HASH = "dfb3fcdb2e65a209b3c84e4faa0c6b6bdcac299bfa73ec58c31ea26226ba05a9da7c9c4926d344a12b2ce2759131fbf527d6128fb71897125458a4fcbb8eb990"

RPROVIDES:${PN} += "python3.9dist-thrift \
python39-thrift \
python3dist-thrift"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python39-six"

inherit rpm
