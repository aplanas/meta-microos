SUMMARY = "Python 3.11 support for Threading Building Blocks (TBB)"
DESCRIPTION = "This package contains python 3.11 bindings for Threading Building Blocks \
(TBB)."
LICENSE = "Apache-2.0"

PV = "2021.8.0"

RPM_NAME = "python311-tbb-2021.8.0-1.5.aarch64.rpm"
RPM_HASH = "0adaf80b7033f6b84d2f856482268fbe5179eac76f39053edf80a1e9be55f9632247c4808aa6be35edaf28be178fa95c53e7b227604c1601b0e4874dd278d019"

RPROVIDES:${PN} += "python3.11dist(tbb) \
python311-tbb \
python311-tbb(aarch-64) \
python3dist(tbb)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libirml1 \
libstdc++.so.6()(64bit) \
libtbb.so.12()(64bit) \
python(abi)"

inherit rpm
