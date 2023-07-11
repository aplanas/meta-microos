SUMMARY = "Python wrapper for Google's RE2"
DESCRIPTION = "Python wrapper for Google's RE2"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "python39-fb-re2-1.0.7-2.15.aarch64.rpm"
RPM_HASH = "a6f61f38cf60fc444235db72cd959e049e05fc6bf46320330cbdc3dd9fb46eb9e23d38ffc1c04b19f42d8c8d53e15ea18108dc0e050a94bb020bf52cc32ec201"

RPROVIDES:${PN} += "python3.9dist-fb-re2 \
python39-fb-re2 \
python3dist-fb-re2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libre2.so.10 \
libstdc++.so.6 \
python-abi"

inherit rpm
