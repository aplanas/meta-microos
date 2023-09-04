SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.27.2"

RPM_NAME = "cmake-full-3.27.2-1.1.aarch64.rpm"
RPM_HASH = "b2116576c22d174f5ff56de908c47507393448914ce9ae0730acb7e1765f9631c07c023f083c6671fd6ad9b85f158fee09f706341c209a41964b27ec05ff00a5"

RPROVIDES:${PN} += "cmake-full \
cmake-implementation \
rpm-macro-cmake \
rpm-macro-cmake-build \
rpm-macro-cmake-install \
rpm-macro-ctest \
rpm-macro-make-jobs"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libform.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libm.so.6 \
libncurses.so.6 \
librhash.so.1 \
libstdc++.so.6 \
libtinfo.so.6 \
libuv.so.1 \
libuv1 \
libz.so.1 \
make \
python3-base"

inherit rpm
