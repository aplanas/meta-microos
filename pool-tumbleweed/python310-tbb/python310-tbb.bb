SUMMARY = "Python 3.10 support for Threading Building Blocks (TBB)"
DESCRIPTION = "This package contains python 3.10 bindings for Threading Building Blocks \
(TBB)."
LICENSE = "Apache-2.0"

PV = "2021.8.0"

RPM_NAME = "python310-tbb-2021.8.0-1.5.aarch64.rpm"
RPM_HASH = "c039ec050b9503f1164e394a33c31186a36bdb5f14e17e67326b57cab207907986d4ed6679e2567e32efa4e0159c1c04605a595dee230de7a14d3b454651a94f"

RPROVIDES:${PN} += "python3-tbb \
python3.10dist(tbb) \
python310-tbb \
python310-tbb(aarch-64) \
python3dist(tbb)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libirml1 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libtbb.so.12()(64bit) \
python(abi)"

inherit rpm
