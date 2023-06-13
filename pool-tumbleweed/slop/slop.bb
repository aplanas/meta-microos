SUMMARY = "Tool to query for a screen region selection"
DESCRIPTION = "slop (Select Operation) queries for a selection from the user and prints \
the region to stdout. It grabs the mouse and turns it into a crosshair, \
lets the user click and drag to make a selection (or click on a window) \
while drawing a pretty box around it, then finally prints the selection's \
dimensions to stdout."
LICENSE = "GPL-3.0-or-later"

PV = "7.6"

RPM_NAME = "slop-7.6-2.6.aarch64.rpm"
RPM_HASH = "5a8f2836da21368e1e5585915fe45c5a12b8b9813533c26307ae15c53e9d202167742d0127ebbd115cb994b206f974326d7b9e5b6e69f9ab53481c9d7353a487"

RPROVIDES:${PN} += "slop \
slop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libslopy.so.7.6()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
