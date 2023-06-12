SUMMARY = "A program maintenance (make) utility using a C-like grammar"
DESCRIPTION = "Icmake allows the programmer to use a program language (closely \
resembling the well-known C-programming language) to define the \
actions involved in (complex) program maintenance. For this, icmake \
offers various special operators as well as a set of support functions \
that have proven to be useful in program maintenance."
LICENSE = "GPL-3.0-only"

PV = "10.03.00"

RPM_NAME = "icmake-10.03.00-3.3.aarch64.rpm"
RPM_HASH = "a5139b31a452a3d06c8690939c5a541c50afe8e09854c70694b9f06ad7b51c4abd01fc47826de16b9d53806275e01023fcc921800904d90143bd3e3ca9d046cc"

RPROVIDES:${PN} += "config(icmake) \
icmake \
icmake(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.31)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm