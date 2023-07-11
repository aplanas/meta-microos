SUMMARY = "Approximation of Nearest Neighbors"
DESCRIPTION = "Annoy (Approximate Nearest Neighbors) is a C++ library with Python \
bindings to search for points in space that are close to a given \
query point. It also creates large read-only file-based data \
structures that are mmapped into memory so that many processes may \
share the same data."
LICENSE = "Apache-2.0"

PV = "1.17.1"

RPM_NAME = "python310-annoy-1.17.1-1.7.aarch64.rpm"
RPM_HASH = "39f82c893bf5f74b6f1af5edff6dbc7cab474a207109797c527ac2a41d70697dfcabfe097e814ef4071621e2284272efed8189923829e079b1546463cbe73cc2"

RPROVIDES:${PN} += "python3.10dist-annoy \
python310-annoy \
python3dist-annoy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
