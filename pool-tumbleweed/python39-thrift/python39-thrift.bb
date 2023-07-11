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

RPM_NAME = "python39-thrift-0.17.0-1.9.aarch64.rpm"
RPM_HASH = "6cb960867a5051444247568463a2369511faa8b86aa9f87800d28d742a1bed59650e953fac516b873626e2f0b750b609f55ee0e852ecaa9bb6fa2a8f807e4b3a"

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
