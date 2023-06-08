SUMMARY = "The 'friendly interactive shell'"
DESCRIPTION = "fish is a command line shell. \
It is geared towards interactive use and its features are focused on user \
friendlieness and discoverability. The language syntax is simple but \
incompatible with other shell languages."
LICENSE = "GPL-2.0-only"

PV = "3.6.1"

RPM_NAME = "fish-3.6.1-1.1.aarch64.rpm"
RPM_HASH = "a0454aeea225e6b675695c91939f3c0eafc532c66f81f94191800cc9f848055ad09f5f0e9206d507aafdf4a942627c8601902e4a2b70117e56870e84e8d56944"

RPROVIDES:${PN} += "application() application(fish.desktop) config(fish) fish fish(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 bc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpcre2-32.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) man"

inherit rpm
