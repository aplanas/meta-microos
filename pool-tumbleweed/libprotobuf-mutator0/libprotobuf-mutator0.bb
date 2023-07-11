SUMMARY = "Shared library for libprotobuf-mutator"
DESCRIPTION = "Shared library for libprotobuf-mutator - a library to randomly mutate \
protobuffers."
LICENSE = "Apache-2.0"

PV = "20190610"

RPM_NAME = "libprotobuf-mutator0-20190610-1.29.aarch64.rpm"
RPM_HASH = "2b479db66a072e6cf598a25dcbb6365c21f862becc7065620235d1cb72905880edff2cae5262957ee17ce723cf783a7a71d901ee36aaec442cf519fdc2c1b48b"

RPROVIDES:${PN} += "libprotobuf-mutator-libfuzzer.so.0 \
libprotobuf-mutator.so.0 \
libprotobuf-mutator0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
