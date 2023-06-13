SUMMARY = "Boost.Atomic runtime library"
DESCRIPTION = "Run-Time support for Boost.Atomic, a library that provides atomic data types \
and operations on these data types, as well as memory ordering constraints \
required for coordinating multiple threads through atomic variables."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_atomic1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "af866cc329c235076c8d881c8666846346941fc65d2ca93f0911a8478efc89aa72d36c18af3668bf141eb016bfccefaaab5446f4c03c58f32e2a64a0b0e8c1de"

RPROVIDES:${PN} += "libboost_atomic.so.1.82.0()(64bit) \
libboost_atomic1_82_0 \
libboost_atomic1_82_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
