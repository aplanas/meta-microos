SUMMARY = "An interactive TUI S.M.A.R.T viewer"
DESCRIPTION = "CrazyDiskInfo is an interactive TUI S.M.A.R.T viewer. \
It offers the following features: \
 \
 * An UI similar to CrystalDiskInfo. \
 * Health and temperature checking algorithms based on CrystalDiskInfo."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "crazydiskinfo-1.1.0-1.13.aarch64.rpm"
RPM_HASH = "08740b6c5d38960f7450246ef40273a7288822713244a30e2a048fe922cdb9b35d925ea50ede3331dc441fb1dcd89a08c7f48e7ea5b505b63c97d1e80c9da896"

RPROVIDES:${PN} += "crazydiskinfo \
crazydiskinfo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatasmart.so.4()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
