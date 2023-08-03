SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.27.1"

RPM_NAME = "cmake-full-3.27.1-1.2.aarch64.rpm"
RPM_HASH = "24c3d62875ff8dfafc5c4a1732b72fd47b4aec1236e7832f5aab7373ccd324171d53662f42224f05bfba59f3ab2cd9dcf3417a418cf678588eec44163e4c936d"

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
