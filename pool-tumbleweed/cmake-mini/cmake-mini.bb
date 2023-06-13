SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.26.4"

RPM_NAME = "cmake-mini-3.26.4-1.1.aarch64.rpm"
RPM_HASH = "e24ceb18aa3782d10ae971d1a708386adce0a447c4d0c8f06eae7c011dcee9f770fd2edfdad2a34118d85ebc4a69a4d6886c4054f9067deab8ea883acd6095f0"

RPROVIDES:${PN} += "cmake-implementation \
cmake-mini \
cmake-mini(aarch-64) \
rpm_macro(cmake) \
rpm_macro(cmake_build) \
rpm_macro(cmake_install) \
rpm_macro(ctest) \
rpm_macro(make_jobs)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libexpat.so.1()(64bit) \
libform.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libncurses.so.6()(64bit) \
librhash.so.0()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libuv.so.1()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
make \
python3-base \
this-is-only-for-build-envs"

inherit rpm
