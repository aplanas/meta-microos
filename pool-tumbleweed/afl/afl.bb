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

PV = "4.08c"

RPM_NAME = "afl-4.08c-1.1.aarch64.rpm"
RPM_HASH = "f1967a750e4dd89b1a45f7974476d6c13b16e662f64caea975b87eb8cd45460c1b87e32ae8ce2576766c1c655f0eddb278c5ac21240d198432a6981d00523eae"

RPROVIDES:${PN} += "afl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
lld"

inherit rpm
