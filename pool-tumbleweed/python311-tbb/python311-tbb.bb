SUMMARY = "Python 3.11 support for Threading Building Blocks (TBB)"
DESCRIPTION = "This package contains python 3.11 bindings for Threading Building Blocks \
(TBB)."
LICENSE = "Apache-2.0"

PV = "2021.10.0"

RPM_NAME = "python311-tbb-2021.10.0-1.1.aarch64.rpm"
RPM_HASH = "eedf5b016853e4946ce6960cf4035726dd7eba84a83a849820278ef15b5f666031fa6f55c1bb350cfed389d4e65d1f5a0e4aca0c0f28bdff6b8122dcd52bf170"

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
