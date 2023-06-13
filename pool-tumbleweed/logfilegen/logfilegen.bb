SUMMARY = "Log file generator for server log files and user-defined formats"
DESCRIPTION = "Logfilegen is a tool to generate common server (nginx, etc) or user-defined \
format log files. It can generate log file with the desired rate (lines per \
second), the file size, lines count and the duration. Each variable of the log \
file can be redefined by the random or static value. The tool is designed to \
be fast and customizable."
LICENSE = "Unlicense"

PV = "3.0.3"

RPM_NAME = "logfilegen-3.0.3-1.1.aarch64.rpm"
RPM_HASH = "f6249f678e267c82c81a1a340835f2601ffb06f4d14867bbfaa9b5c9d446e11891899492cc146d8f81f42b693d70fb2eecb441fdf1dc28f5c974144e4f7a0c31"

RPROVIDES:${PN} += "logfilegen \
logfilegen(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
