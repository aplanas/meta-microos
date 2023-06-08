SUMMARY = "CLI tool to render text-mode art files as PNG files"
DESCRIPTION = "Ansilove-Term is a command line tool to render text-mode art files as \
PNG files, as well as displaying in several different mediums."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git.20190908"

RPM_NAME = "ansilove-term-0.0.0+git.20190908-2.1.aarch64.rpm"
RPM_HASH = "702922e00037f30fe016d28a894d971918c8f831b7ef36dd4e59f1d999edcd03314bb99149cf3554afcc61327a65e1295a23d1141a612602d2b0efc6e1594877"

RPROVIDES:${PN} += "ansilove-term ansilove-term(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
