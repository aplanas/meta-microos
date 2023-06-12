SUMMARY = "A high-performance, full-featured text search engine written in C++"
DESCRIPTION = "An up to date C++ port of the popular Java Lucene library, a high-performance, full-featured text search engine."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.0.8"

RPM_NAME = "liblucene++0-3.0.8-4.2.aarch64.rpm"
RPM_HASH = "f03639f1dcd122d14684d11aeae8c1669911760aa017ed07edd3bb520968044fd4bc5bca93e10a88aa866c4cc40530ecdae0726f6886c01a9cc53c0e1537e260"

RPROVIDES:${PN} += "liblucene++-contrib.so.0()(64bit) \
liblucene++.so.0()(64bit) \
liblucene++0 \
liblucene++0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
