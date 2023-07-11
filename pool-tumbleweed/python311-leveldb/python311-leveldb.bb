SUMMARY = "Python bindings for leveldb database library"
DESCRIPTION = "Python bindings for leveldb database library."
LICENSE = "BSD-3-Clause"

PV = "0.201"

RPM_NAME = "python311-leveldb-0.201-2.13.aarch64.rpm"
RPM_HASH = "7a2464f9326493162da03db3d83bfcdc25361f78a191f3007c2feec780b796b7044aee5c7cdd1326f044bf08c791dde2604880b2475e2ef0e5e630b89b153b83"

RPROVIDES:${PN} += "python3-leveldb \
python3.11dist-leveldb \
python311-leveldb \
python3dist-leveldb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
