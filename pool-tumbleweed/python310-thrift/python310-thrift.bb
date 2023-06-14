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

RPM_NAME = "python310-thrift-0.17.0-1.6.aarch64.rpm"
RPM_HASH = "5408c4bf9f1dcae93ae7fd4b70ff257f582843421503c3d1dc08510672418f321444d61d444e2e9b4019a841e31838288fad8032d541b2e33fc34926d4676056"

RPROVIDES:${PN} += "python3-thrift \
python3.10dist-thrift \
python310-thrift \
python3dist-thrift"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python310-six"

inherit rpm
