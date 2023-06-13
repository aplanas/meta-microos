SUMMARY = "Approximation of Nearest Neighbors"
DESCRIPTION = "Annoy (Approximate Nearest Neighbors) is a C++ library with Python \
bindings to search for points in space that are close to a given \
query point. It also creates large read-only file-based data \
structures that are mmapped into memory so that many processes may \
share the same data."
LICENSE = "Apache-2.0"

PV = "1.17.1"

RPM_NAME = "python39-annoy-1.17.1-1.5.aarch64.rpm"
RPM_HASH = "1a039ca34bb7513be712c78bfdd151a9d3be2d2682cbefec77239688aefde7d90cc79b5a475be40b2e6b77d4de25b9d8ed931b171ce213e5e211f710bbc44cb9"

RPROVIDES:${PN} += "python3.9dist(annoy) \
python39-annoy \
python39-annoy(aarch-64) \
python3dist(annoy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
