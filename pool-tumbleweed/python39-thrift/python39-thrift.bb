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

RPM_NAME = "python39-thrift-0.17.0-1.6.aarch64.rpm"
RPM_HASH = "c711cdd9d59fc44c71efe973fa75a87d2a13ba4f637837bfd227d7ce061179e1a4a7750ab6eff503ce43862701b37c02a396725947087ec38030dd9f1d45948e"

RPROVIDES:${PN} += "python3.9dist(thrift) \
python39-thrift \
python39-thrift(aarch-64) \
python3dist(thrift)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python39-six"

inherit rpm
