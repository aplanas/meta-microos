SUMMARY = "Count the number of primes"
DESCRIPTION = "primecount is a command-line program that counts the primes below an \
integer x ≤ 10^31 using highly optimized implementations of the \
combinatorial prime counting algorithms."
LICENSE = "BSD-2-Clause"

PV = "7.8"

RPM_NAME = "primecount-7.8-1.1.aarch64.rpm"
RPM_HASH = "4c7a6c178f1884be49d525ef3d2dbc9718da5fd13f64ea323960ef0dac5ebc2923a4dd5973048ce7c9992a2950bc33d1c077b044524f4e152a9b0a0b9f5ff9eb"

RPROVIDES:${PN} += "primecount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libprimecount.so.7 \
libprimesieve.so.11 \
libstdc++.so.6"

inherit rpm
