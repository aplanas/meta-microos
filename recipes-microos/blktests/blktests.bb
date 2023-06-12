SUMMARY = "Linux kernel block layer testing framework"
DESCRIPTION = "blktests is a test framework for the Linux kernel block layer and \
storage stack. It is inspired by the xfstests filesystem testing \
framework."
LICENSE = "GPL-2.0-or-later"

PV = "0+20230302.676d42c"

RPM_NAME = "blktests-0+20230302.676d42c-1.1.aarch64.rpm"
RPM_HASH = "7de94a44c7472356f34770b8a850120dfa4eba58cb6bac04d4976d89ca7b1a042bbfdc41b5ea093ab6d3bbcf182c862a349726f0f00a00d7b3f874e6348e9abf"

RPROVIDES:${PN} += "blktests \
blktests(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
fio \
gawk \
gcc \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
make"

inherit rpm
