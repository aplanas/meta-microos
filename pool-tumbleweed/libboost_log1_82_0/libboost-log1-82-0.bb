SUMMARY = "Boost.Log runtime Run-Time library"
DESCRIPTION = "This package contains runtime library for Boost.Log."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_log1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "922d7f5b29ac275710c200ed58ac1da3a96af417782a127b667dc176813e15f2f2f9e47a181bcb95bcc23ddfe2f95c5d1d5e0eb812c053988c6680cfe46c1270"

RPROVIDES:${PN} += "libboost_log.so.1.82.0()(64bit) \
libboost_log1_82_0 \
libboost_log1_82_0(aarch-64) \
libboost_log_setup.so.1.82.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
