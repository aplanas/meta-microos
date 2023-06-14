SUMMARY = "Approximation of Nearest Neighbors"
DESCRIPTION = "Annoy (Approximate Nearest Neighbors) is a C++ library with Python \
bindings to search for points in space that are close to a given \
query point. It also creates large read-only file-based data \
structures that are mmapped into memory so that many processes may \
share the same data."
LICENSE = "Apache-2.0"

PV = "1.17.1"

RPM_NAME = "python310-annoy-1.17.1-1.5.aarch64.rpm"
RPM_HASH = "dbc5754ba996aba8dc999221aea22d7a6d1d05af07c313066ab1fdd876aec0622ffd682b45d6a839370cf1a531f31d1026bfb5392fb0dac4f6635294dd39e6ce"

RPROVIDES:${PN} += "python3-annoy \
python3.10dist-annoy \
python310-annoy \
python3dist-annoy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
