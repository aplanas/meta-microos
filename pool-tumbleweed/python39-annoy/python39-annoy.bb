SUMMARY = "Approximation of Nearest Neighbors"
DESCRIPTION = "Annoy (Approximate Nearest Neighbors) is a C++ library with Python \
bindings to search for points in space that are close to a given \
query point. It also creates large read-only file-based data \
structures that are mmapped into memory so that many processes may \
share the same data."
LICENSE = "Apache-2.0"

PV = "1.17.1"

RPM_NAME = "python39-annoy-1.17.1-1.7.aarch64.rpm"
RPM_HASH = "f82f422def5c9eb1fe2b4292c85c03014171e84d382ee7a09f33b1f0ab6263da5b519daa30e8d9e92abf35e530e171a67a48b79fcdd8c598ebe2c05b1e6b1eab"

RPROVIDES:${PN} += "python3.9dist-annoy \
python39-annoy \
python3dist-annoy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
