SUMMARY = "Intelligent Pinyin IME"
DESCRIPTION = "libpinyin is a staging joint effort of many Chinese Pinyin IME development \
teams. It is an intelligent (and universal) sentence-based Pinyin IME backend \
supporting many language models and frontends. \
 \
This package provides runtime library for libpinyin."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.1"

RPM_NAME = "libpinyin15-2.8.1-1.3.aarch64.rpm"
RPM_HASH = "c3ae4859fdcaf18eee42f84569641435b62039d574114a0a8045c819aa5c1708b2ff55824f064844ca3144dae82e34ff32ae3a322f4226dfb4e91a88d50445a2"

RPROVIDES:${PN} += "libpinyin.so.15()(64bit) \
libpinyin.so.15(LIBPINYIN)(64bit) \
libpinyin15 \
libpinyin15(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libkyotocabinet.so.16()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpinyin-data \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
