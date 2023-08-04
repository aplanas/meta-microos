SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.27.1"

RPM_NAME = "cmake-full-3.27.1-1.3.aarch64.rpm"
RPM_HASH = "4a62545b0a6649acf9b065bd4341e38183a562d899b51cd0869f2f180cffb3e4f8590dd5ef4cca911326fd2f865e809b4128a269fdaac617468464302cd48075"

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
