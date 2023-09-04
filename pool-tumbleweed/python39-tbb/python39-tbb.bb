SUMMARY = "Python 3.9 support for Threading Building Blocks (TBB)"
DESCRIPTION = "This package contains python 3.9 bindings for Threading Building Blocks \
(TBB)."
LICENSE = "Apache-2.0"

PV = "2021.10.0"

RPM_NAME = "python39-tbb-2021.10.0-1.1.aarch64.rpm"
RPM_HASH = "72ec22a69a1494fc1310c10f89dafa0a03f992da5dbf43c17156374199cc0b486dab3436baefe4c183f6076b3be98aa5c299ec210e91ad0fd37c53eea895f33f"

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
