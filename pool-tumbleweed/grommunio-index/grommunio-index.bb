SUMMARY = "Generator for grommunio-web search indexes"
DESCRIPTION = "A C++17 program for the generation of grommunio-web fulltext search indexes."
LICENSE = "AGPL-3.0-or-later"

PV = "0.1.18.6a0f73a"

RPM_NAME = "grommunio-index-0.1.18.6a0f73a-1.3.aarch64.rpm"
RPM_HASH = "b08b7a49af3aa5c75b19a59445fa83aa134930ff9657397062163886a4bf19453f221ad839ea23fe829b44dabf8f59d719d4f28fac637cedb30ae6f4f2d97dfc"

RPROVIDES:${PN} += "grommunio-index \
grommunio-index(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexmdbpp.so.0()(64bit) \
libexmdbpp0 \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
user(groweb)"

inherit rpm
