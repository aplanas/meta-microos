SUMMARY = "Python 3.9 support for Threading Building Blocks (TBB)"
DESCRIPTION = "This package contains python 3.9 bindings for Threading Building Blocks \
(TBB)."
LICENSE = "Apache-2.0"

PV = "2021.8.0"

RPM_NAME = "python39-tbb-2021.8.0-1.5.aarch64.rpm"
RPM_HASH = "c31cbbaa3d9e736bb412ed9371dd766874b3d277e16885bd392dfe24f4517b27b2965b5a36bcc10d2c539dc87449769e65e037b03a8adabfe2c7d23050c13264"

RPROVIDES:${PN} += "python3.9dist(tbb) \
python39-tbb \
python39-tbb(aarch-64) \
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
