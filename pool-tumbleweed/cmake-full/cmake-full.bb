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
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libexpat.so.1()(64bit) \
libform.so.6()(64bit) \
libform.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjsoncpp.so.25()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
librhash.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libuv.so.1()(64bit) \
libz.so.1()(64bit) \
make \
python3-base"

inherit rpm
