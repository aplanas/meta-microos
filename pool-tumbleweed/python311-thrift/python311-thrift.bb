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

RPM_NAME = "python311-thrift-0.17.0-1.10.aarch64.rpm"
RPM_HASH = "fc12d9aae4ca76d9cfabfb9ffbd60d39b50926ff3610be9e1c2378306d0a34060535f56599c921d20c5e9249341f5ae95af3baa98d708f2cd69caecebb844360"

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
