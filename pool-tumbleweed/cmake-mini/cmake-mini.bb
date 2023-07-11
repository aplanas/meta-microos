SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.26.4"

RPM_NAME = "cmake-mini-3.26.4-3.1.aarch64.rpm"
RPM_HASH = "f5592cf01acd11fcf254360d34aa03c7cae03b010b18717b03d8d7659fc7be7e1f62811187d53799812949aa05f1ed9127d1cba0a7a6c49fd400c35c8f475d6b"

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
librhash.so.0 \
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
