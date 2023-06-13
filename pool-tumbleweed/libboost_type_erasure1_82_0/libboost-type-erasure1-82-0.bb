SUMMARY = "Boost.TypeErasure runtime library"
DESCRIPTION = "This package contains Boost::TypeErasure runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_type_erasure1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "04add3f6178305d4ddd0c372a524a25672d2eb462ffe504ae79cd1bff0d321173a31f9b1a79513208249d05201f252f26ad7e212a9b3542b09829313936ff786"

RPROVIDES:${PN} += "libboost_type_erasure.so.1.82.0()(64bit) \
libboost_type_erasure1_82_0 \
libboost_type_erasure1_82_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
