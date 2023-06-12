SUMMARY = "The Colm programming language environment"
DESCRIPTION = "Colm is a programming language designed for the analysis and \
transformation of computer languages. It has a type system based on \
formal languages. Rather than define classes or data structures, one \
defines grammars. A parser is constructed automatically from the \
grammar, and the parser is used for two purposes: to parse the input \
language, and to parse the structural patterns in the program that \
performs the analysis."
LICENSE = "MIT"

PV = "0.14.7"

RPM_NAME = "colm-devel-0.14.7-2.4.aarch64.rpm"
RPM_HASH = "613417928235a5afb27ded221f7108123b3e32d27dfcb558d29b0cf0683e7fa15c895446f89dc9928c1b2f23785775cc89358170f9185443bcbb3eb1c2467603"

RPROVIDES:${PN} += "colm-devel \
colm-devel(aarch-64) \
ragel-devel"
RDEPENDS:${PN} += "/bin/bash \
gcc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcolm-0.14.7.so()(64bit) \
libcolm-0_14_7 \
libfsm-0_14_7 \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
