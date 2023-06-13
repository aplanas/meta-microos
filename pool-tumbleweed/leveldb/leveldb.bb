SUMMARY = "A key/value-store"
DESCRIPTION = "leveldb implements a system for maintaining a persistent key/value store."
LICENSE = "BSD-3-Clause"

PV = "1.23"

RPM_NAME = "leveldb-1.23-2.3.aarch64.rpm"
RPM_HASH = "b2b6425a65b56060c145420668189b1dd4751d0db2e2ec2ef4034b0fdd7fcaa93776455feeb496f12c3612cfd485a98a72dfaf96e549cecf48f7d1faefbf4623"

RPROVIDES:${PN} += "leveldb \
leveldb(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libsnappy.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
