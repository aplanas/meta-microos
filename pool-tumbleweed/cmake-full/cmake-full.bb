SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.26.4"

RPM_NAME = "cmake-full-3.26.4-1.1.aarch64.rpm"
RPM_HASH = "3375cb302c0dda401fdc13a666f8f1484a27664e36983472e51b8ee7432f0d1cdb3493fa14a811f9c72a351a3da94d7edc51b88f46934ab4173197e0c9337c7c"

RPROVIDES:${PN} += "cmake-full \
cmake-full(aarch-64) \
cmake-implementation \
rpm_macro(cmake) \
rpm_macro(cmake_build) \
rpm_macro(cmake_install) \
rpm_macro(ctest) \
rpm_macro(make_jobs)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libexpat.so.1()(64bit) \
libform.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjsoncpp.so.25()(64bit) \
libm.so.6()(64bit) \
libncurses.so.6()(64bit) \
librhash.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libuv.so.1()(64bit) \
libz.so.1()(64bit) \
make \
python3-base"

inherit rpm
