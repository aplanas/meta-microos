SUMMARY = "Python 3.10 support for Threading Building Blocks (TBB)"
DESCRIPTION = "This package contains python 3.10 bindings for Threading Building Blocks \
(TBB)."
LICENSE = "Apache-2.0"

PV = "2021.10.0"

RPM_NAME = "python310-tbb-2021.10.0-1.1.aarch64.rpm"
RPM_HASH = "d984266c47628927bae0b7320e9e911677515031bfc42cc0af2d7083e0628f4458320849c503c92eb5b6e3fcea36c61903be7aa56639c84035ef319117eeb377"

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
