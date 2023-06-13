SUMMARY = "Finite state machine compiler"
DESCRIPTION = "Ragel compiles finite state machines from regular languages into \
executable C, C++, Objective-C, or D code. Ragel state machines can \
not only recognize byte sequences as regular expression machines do, \
but can also execute code at arbitrary points in the recognition of a \
regular language. Code embedding is done using inline operators that \
do not disrupt the regular language syntax."
LICENSE = "MIT"

PV = "7.0.4"

RPM_NAME = "ragel-7.0.4-1.10.aarch64.rpm"
RPM_HASH = "4ec8e0e0ff2a6573055e6ef5ec66653111642f2ebdca37abe26e1e589791c27ece0ccec5e54a1b2b736bca3886d8236c01d5be67474cb4bbe4c8c0754109efdf"

RPROVIDES:${PN} += "libragel.so.0()(64bit) \
ragel \
ragel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcolm-0.14.7.so()(64bit) \
libfsm-0.14.7.so()(64bit) \
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
