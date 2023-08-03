SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.27.1"

RPM_NAME = "cmake-mini-3.27.1-1.2.aarch64.rpm"
RPM_HASH = "b1f2a0102bf1a0ba5ef1efb9cfb70629a6841949753d01c732af70498c7dbc525acaea296e3905e41805ff838f2105d147b53711ba25e376baafab4df39e24a1"

RPROVIDES:${PN} += "cmake-implementation \
cmake-mini \
rpm-macro-cmake \
rpm-macro-cmake-build \
rpm-macro-cmake-install \
rpm-macro-ctest \
rpm-macro-make-jobs"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libform.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
libm.so.6 \
libncurses.so.6 \
librhash.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libtinfo.so.6 \
libuv.so.1 \
libz.so.1 \
libzstd.so.1 \
make \
python3-base \
this-is-only-for-build-envs"

inherit rpm
