SUMMARY = "Test program for Voikko spell checker"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
This package contains a test program for using Voikko spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "voikkospell-4.3.1-1.10.aarch64.rpm"
RPM_HASH = "6785872f05fa6bf041b36f7cae3091a3dc1238492d26e394c6dabaf1551aaef288da9c5acf769ed1a1f186d388c6fe866a7502554df516cd73493ccfc317d5b4"

RPROVIDES:${PN} += "voikkospell \
voikkospell(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvoikko.so.1()(64bit) \
libvoikko1"

inherit rpm