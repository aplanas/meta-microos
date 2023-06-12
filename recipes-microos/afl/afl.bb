SUMMARY = "American fuzzy lop is a security-oriented fuzzer"
DESCRIPTION = "American fuzzy lop is a security-oriented fuzzer that employs a novel type \
of compile-time instrumentation and genetic algorithms to automatically \
discover clean, interesting test cases that trigger new internal states in \
the targeted binary. This substantially improves the functional coverage \
for the fuzzed code. The compact synthesized corpora produced by the tool \
are also useful for seeding other, more labor- or resource-intensive \
testing regimes down the road. \
 \
Compared to other instrumented fuzzers, afl-fuzz is designed to be \
practical: it has modest performance overhead, uses a variety of highly \
effective fuzzing strategies and effort minimization tricks, requires \
essentially no configuration, and seamlessly handles complex, real-world \
use cases - say, common image parsing or file compression libraries."
LICENSE = "Apache-2.0"

PV = "4.06c"

RPM_NAME = "afl-4.06c-1.1.aarch64.rpm"
RPM_HASH = "5ae823ca09563653f628dce6763a95afd4ad21c53606b73f5476111da8c916cef06b07e59dbc202879b7c8910290e3c3ea9c5ee3f7eaadbabd9b43660129de06"

RPROVIDES:${PN} += "afl \
afl(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
lld"

inherit rpm
