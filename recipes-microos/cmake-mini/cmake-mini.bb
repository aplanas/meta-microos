SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.26.3"

RPM_NAME = "cmake-mini-3.26.3-3.1.aarch64.rpm"
RPM_HASH = "098f8f59be342452b618a89f9a5607266cc4b01d3a2356cc7b5aea3040b9a9b139dd67ca90f9bb75aeb27400485f620f08cfe9fe441e4331716a27ce0a2efdd9"

RPROVIDES:${PN} += "cmake-implementation cmake-mini cmake-mini(aarch-64) rpm_macro(cmake) rpm_macro(cmake_build) rpm_macro(cmake_install) rpm_macro(ctest) rpm_macro(make_jobs)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.36)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libexpat.so.1()(64bit) libform.so.6()(64bit) libform.so.6(NCURSESTW6_5.7.20081102)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) liblzma.so.5(XZ_5.2)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) librhash.so.0()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libuv.so.1()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit) make python3-base this-is-only-for-build-envs"

inherit rpm
