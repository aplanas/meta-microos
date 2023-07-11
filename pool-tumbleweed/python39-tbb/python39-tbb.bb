SUMMARY = "Python 3.9 support for Threading Building Blocks (TBB)"
DESCRIPTION = "This package contains python 3.9 bindings for Threading Building Blocks \
(TBB)."
LICENSE = "Apache-2.0"

PV = "2021.9.0"

RPM_NAME = "python39-tbb-2021.9.0-1.1.aarch64.rpm"
RPM_HASH = "53b6865ce2676c1162eb58ba7ec894dc2bc05de73d3569007da693a58631ada14cd7f226a5a70daa48dd11883044c2573f9df53b14905724da505f3f0f29e617"

RPROVIDES:${PN} += "python3.9dist-tbb \
python39-tbb \
python3dist-tbb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libirml1 \
libstdc++.so.6 \
libtbb.so.12 \
python-abi"

inherit rpm
