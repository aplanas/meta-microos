SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.27.2"

RPM_NAME = "cmake-mini-3.27.2-1.1.aarch64.rpm"
RPM_HASH = "a88f2681598255ed63ee1900d202de3e71e6bfa3d4c54677502d13b5336e08b37ff81ad7133b56bd24bebdc0e0acc41b3f7fb40e70abebe06636080a2e89f55d"

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
