SUMMARY = "Command line tools for use with framecpp"
DESCRIPTION = "This package provides command line tools  for use with framecpp."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "ldas-tools-framecpp-utils-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "e2ca4865d3580fe0ad9f839ee230f05ef30e2eb343d57729b3ea2c26f82719fc268ff44fb5649be567e7b3ec78bac0db1b87a0bce7cfc199df012e24ceb62653"

RPROVIDES:${PN} += "ldas-tools-framecpp-utils \
ldas-tools-framecpp-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libframecpp.so.12()(64bit) \
libframecpp3.so.6()(64bit) \
libframecpp4.so.8()(64bit) \
libframecpp6.so.8()(64bit) \
libframecpp7.so.4()(64bit) \
libframecpp8.so.7()(64bit) \
libframecppcmn.so.11()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libldastoolsal.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
