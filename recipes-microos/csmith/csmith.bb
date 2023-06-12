SUMMARY = "Random C code generator"
DESCRIPTION = "Csmith is a tool that can generate random C programs that statically and \
dynamically conform to the C99 standard. It is useful for stress-testing \
compilers, static analyzers, and other tools that process C code."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "csmith-2.3.0-1.23.aarch64.rpm"
RPM_HASH = "265370caa740b8010825260580da786cffe80722fbc4afa7842788b060db0ffe6bf6a98ee7f0dccddbce76151c0600536a73dc78b9cbf43f3ec9caea124f6f39"

RPROVIDES:${PN} += "csmith \
csmith(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
