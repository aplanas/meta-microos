SUMMARY = "Development files for the hhdate library"
DESCRIPTION = "A date and time library based on the C++11/14/17 chrono header."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "libdate-tz3-3.0.1-3.3.aarch64.rpm"
RPM_HASH = "16475f9c0ca2ac24ef3451f1ff5a99ba82e2fa6d3b4fa81a30f64a1a23e99296959735beb3953fe7ed3e676e0de9eba2c4351efbdbbd49cd463ecc02ccf1a6e5"

RPROVIDES:${PN} += "libdate-tz.so.3()(64bit) \
libdate-tz3 \
libdate-tz3(aarch-64)"

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
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
