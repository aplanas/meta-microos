SUMMARY = "Commandline parser generator"
DESCRIPTION = "Gengetopt is a tool to generate C code to parse getopt styled command line \
arguments. \
It's similar or even more powerful than the well known libpopt but does not \
add any run or compile time dependencies to your projects. Moreover \
reading/writing the options from/to config files is also supported."
LICENSE = "GPL-3.0-or-later"

PV = "2.23"

RPM_NAME = "gengetopt-2.23-1.13.aarch64.rpm"
RPM_HASH = "8efbcc671b378b39444592a6beb6ff9367977befa2a09461f1e8c781de7590339b9bc066d977e2222e7a623c48b228f36e4e5760c631c5933f6f3234af62ad31"

RPROVIDES:${PN} += "gengetopt \
gengetopt(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
