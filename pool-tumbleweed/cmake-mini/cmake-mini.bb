SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.26.4"

RPM_NAME = "cmake-mini-3.26.4-1.1.aarch64.rpm"
RPM_HASH = "e24ceb18aa3782d10ae971d1a708386adce0a447c4d0c8f06eae7c011dcee9f770fd2edfdad2a34118d85ebc4a69a4d6886c4054f9067deab8ea883acd6095f0"

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
