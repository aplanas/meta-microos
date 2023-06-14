SUMMARY = "Python bindings for leveldb database library"
DESCRIPTION = "Python bindings for leveldb database library."
LICENSE = "BSD-3-Clause"

PV = "0.201"

RPM_NAME = "python310-leveldb-0.201-2.11.aarch64.rpm"
RPM_HASH = "38589e66c09c4813ee2e65691f7a8680e3765acc632a7b1215e9222a75b78b0955e45a493e1341450a1a19bdd4365ba3f9833116ab51533355573420f824d8bc"

RPROVIDES:${PN} += "python3-leveldb \
python3.10dist-leveldb \
python310-leveldb \
python3dist-leveldb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
