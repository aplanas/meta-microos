SUMMARY = "Collection of C++ functions emulating Python's string class methods"
DESCRIPTION = "Pystring is a collection of C++ functions which match the interface and \
behavior of Python's string class methods using std::string. Implemented in \
C++, it does not require or make use of a Python interpreter. It provides \
convenience and familiarity for common string operations not included in the \
standard C++ library. It's also useful in environments where both C++ and \
Python are used. \
 \
Overlapping functionality (such as index and slice/substr) of std::string is \
included to match Python interfaces. \
 \
Originally developed at Sony Pictures Imageworks. \
http://opensource.imageworks.com/"
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "libpystring0_0-1.1.3-1.8.aarch64.rpm"
RPM_HASH = "ec503f3dd93aed22230ee047cf7ee6276fe1bf2cc4c3a4e8424267548536c51ba9d3fe7492efbea87ef34de96a290ef049549e9329636aa306cdc8a98becc452"

RPROVIDES:${PN} += "libpystring.so.0.0()(64bit) \
libpystring0_0 \
libpystring0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
