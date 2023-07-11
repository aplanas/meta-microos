SUMMARY = "Python bindings for leveldb database library"
DESCRIPTION = "Python bindings for leveldb database library."
LICENSE = "BSD-3-Clause"

PV = "0.201"

RPM_NAME = "python310-leveldb-0.201-2.13.aarch64.rpm"
RPM_HASH = "4e8a0430ca434104822070b844a33a6399d1ad2e9e2436586259dd028ee10fdd5fe9ee6c7c53753cc49653b51d474c9e419a159c70a17faebfcbef8512cc7022"

RPROVIDES:${PN} += "python3.10dist-leveldb \
python310-leveldb \
python3dist-leveldb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
