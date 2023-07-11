SUMMARY = "Python bindings for leveldb database library"
DESCRIPTION = "Python bindings for leveldb database library."
LICENSE = "BSD-3-Clause"

PV = "0.201"

RPM_NAME = "python39-leveldb-0.201-2.13.aarch64.rpm"
RPM_HASH = "46e861f4b31c55c6f12a83b3287d6fa22f4852a14b8064cdb0030d9a7327123c989dd05bf1d344031bbda86dd2a19b115288da3d98a85cf6ba1ed841678f6970"

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
