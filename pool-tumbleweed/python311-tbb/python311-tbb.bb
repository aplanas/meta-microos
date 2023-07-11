SUMMARY = "Python 3.11 support for Threading Building Blocks (TBB)"
DESCRIPTION = "This package contains python 3.11 bindings for Threading Building Blocks \
(TBB)."
LICENSE = "Apache-2.0"

PV = "2021.9.0"

RPM_NAME = "python311-tbb-2021.9.0-1.1.aarch64.rpm"
RPM_HASH = "a9caf2c182f8637346da04c618fbe1e328805c453deb93e916c76e5eb8e27ed53d5f0c1bf6aba6a560674bd234e337b1affbeb156ad1228cc54560d83796ce3b"

RPROVIDES:${PN} += "python3-tbb \
python3.11dist-tbb \
python311-tbb \
python3dist-tbb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libirml1 \
libstdc++.so.6 \
libtbb.so.12 \
python-abi"

inherit rpm
