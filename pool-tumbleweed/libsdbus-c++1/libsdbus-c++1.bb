SUMMARY = "Shared library for sdbus-cpp"
DESCRIPTION = "Shared library files for sdbus-cpp."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "libsdbus-c++1-1.2.0-1.5.aarch64.rpm"
RPM_HASH = "d194b6c4ff0c444904684d25ba4faea3de7a69edbe154e3b558b5257f7cfb7bc87dee44869468ce08d4885f8bb6ee6c11f2c6039bcd6c3f4c05a911cf8b5ead4"

RPROVIDES:${PN} += "libsdbus-c++.so.1()(64bit) \
libsdbus-c++1 \
libsdbus-c++1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_222)(64bit) \
libsystemd.so.0(LIBSYSTEMD_236)(64bit) \
libsystemd.so.0(LIBSYSTEMD_240)(64bit) \
libsystemd.so.0(LIBSYSTEMD_241)(64bit) \
libsystemd.so.0(LIBSYSTEMD_243)(64bit) \
libsystemd.so.0(LIBSYSTEMD_246)(64bit)"

inherit rpm
