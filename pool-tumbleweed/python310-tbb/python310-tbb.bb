SUMMARY = "Python 3.10 support for Threading Building Blocks (TBB)"
DESCRIPTION = "This package contains python 3.10 bindings for Threading Building Blocks \
(TBB)."
LICENSE = "Apache-2.0"

PV = "2021.9.0"

RPM_NAME = "python310-tbb-2021.9.0-1.1.aarch64.rpm"
RPM_HASH = "752659cc780fd3c0ae84220e672e5d443d9de30a49575f26895685e05574438e28c27e6a7013a4dc1c7f511186d8e7ed7c16e7940e05d91e651c7b8f77463581"

RPROVIDES:${PN} += "python3.10dist-tbb \
python310-tbb \
python3dist-tbb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libirml1 \
libstdc++.so.6 \
libtbb.so.12 \
python-abi"

inherit rpm
