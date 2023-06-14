SUMMARY = "Python bindings for leveldb database library"
DESCRIPTION = "Python bindings for leveldb database library."
LICENSE = "BSD-3-Clause"

PV = "0.201"

RPM_NAME = "python39-leveldb-0.201-2.11.aarch64.rpm"
RPM_HASH = "ff06c6489efa66b23a064971ecc7485681db8a0c52ebff9d7cf1cce93695fb27daf06631e672b85d99fb3be118b2d7742778a78bd89417b307d6b034d09cc72e"

RPROVIDES:${PN} += "python3.9dist-leveldb \
python39-leveldb \
python3dist-leveldb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
