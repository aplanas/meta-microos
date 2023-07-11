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

PV = "4.07c"

RPM_NAME = "afl-4.07c-1.2.aarch64.rpm"
RPM_HASH = "1714826c79d12af7008b2b3a3809b6c69de9b045ea01545bb456e4bd5d3dbee11191ce3b2813f70e9df31ae9d83627d66552d844ccbdc48bf0a63d507ba04a7d"

RPROVIDES:${PN} += "afl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
lld"

inherit rpm
