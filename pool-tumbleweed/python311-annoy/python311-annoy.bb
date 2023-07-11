SUMMARY = "Approximation of Nearest Neighbors"
DESCRIPTION = "Annoy (Approximate Nearest Neighbors) is a C++ library with Python \
bindings to search for points in space that are close to a given \
query point. It also creates large read-only file-based data \
structures that are mmapped into memory so that many processes may \
share the same data."
LICENSE = "Apache-2.0"

PV = "1.17.1"

RPM_NAME = "python311-annoy-1.17.1-1.7.aarch64.rpm"
RPM_HASH = "61de49216f7e7c16ca039887d7a8708e198b2ada0e7640e7e4d31d5a192608acbd6ca102c19415322c37fda09df39017ce749d3af17d1907c3585f9313ac6b9c"

RPROVIDES:${PN} += "python3-annoy \
python3.11dist-annoy \
python311-annoy \
python3dist-annoy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
