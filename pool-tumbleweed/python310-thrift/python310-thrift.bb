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

RPM_NAME = "python310-thrift-0.17.0-1.9.aarch64.rpm"
RPM_HASH = "f3314654059287c379ce935b311cdf0279795fd5e8ab79c1e94bb0d477184c7dac44e1043c46a1cc372fb3fa3a201d7db9ff695c2bc795c9884b369a603fb8af"

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
