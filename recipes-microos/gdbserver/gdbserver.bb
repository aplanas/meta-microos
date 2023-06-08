SUMMARY = "A standalone server for GDB (the GNU source-level debugger)"
DESCRIPTION = "GDB, the GNU debugger, allows you to debug programs written in C, C++, \
Java, and other languages, by executing them in a controlled fashion \
and printing their data. \
 \
This package provides a program that allows you to run GDB on a different \
machine than the one which is running the program being debugged."
LICENSE = "GPL-3.0-only-WITH-GCC-exception-3.1 & GPL-3.0-or-later & LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "12.1"

RPM_NAME = "gdbserver-12.1-7.1.aarch64.rpm"
RPM_HASH = "2e7ecc944d9efc3673b82c2b6dc5e7589ebb25145e98a6f4c5a8d2a0371812c68c1d457bcf7d4881725305bf69242a769cdde6858e0551d7c843cf64be66d057"

RPROVIDES:${PN} += "gdbserver gdbserver(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
