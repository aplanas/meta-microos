SUMMARY = "Python bindings for leveldb database library"
DESCRIPTION = "Python bindings for leveldb database library."
LICENSE = "BSD-3-Clause"

PV = "0.201"

RPM_NAME = "python311-leveldb-0.201-2.11.aarch64.rpm"
RPM_HASH = "4479b6fe6c0d58830de86607f3e3bbda87de0a96afee072159f3b8bceea682c07636d25ed06932b6b29ac6d6c6d9e10bfb9a24805b149a0bfc5dc9683cc15048"

RPROVIDES:${PN} += "python3.11dist(leveldb) \
python311-leveldb \
python311-leveldb(aarch-64) \
python3dist(leveldb)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
