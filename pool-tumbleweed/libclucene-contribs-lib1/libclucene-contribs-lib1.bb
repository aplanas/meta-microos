SUMMARY = "Language specific text analyzers for clucene-core"
DESCRIPTION = "CLucene is a C++ port of Lucene. It is a high-performance, full-featured text \
search engine written in C++. CLucene is faster than lucene as it is written \
in C++. \
 \
This package contains language specific text analyzers for clucene."
LICENSE = "Apache-2.0 | LGPL-2.1-only"

PV = "2.3.3.4"

RPM_NAME = "libclucene-contribs-lib1-2.3.3.4-18.5.aarch64.rpm"
RPM_HASH = "b9f934ea92751eb1c2d8414b144292f9c0c9ac230947c2f35b86643fd9af109933b46ad80a42d7a997b9a245bd2e6e5e614ac8bd5d5fff1a270af7c1246a9c79"

RPROVIDES:${PN} += "libclucene-contribs-lib.so.1()(64bit) \
libclucene-contribs-lib1 \
libclucene-contribs-lib1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libclucene-core.so.1()(64bit) \
libclucene-shared.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libz.so.1()(64bit)"

inherit rpm
