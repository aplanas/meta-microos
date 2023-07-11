SUMMARY = "Count the number of primes"
DESCRIPTION = "primecount is a command-line program that counts the primes below an \
integer x ≤ 10^31 using highly optimized implementations of the \
combinatorial prime counting algorithms."
LICENSE = "BSD-2-Clause"

PV = "7.9"

RPM_NAME = "primecount-7.9-1.1.aarch64.rpm"
RPM_HASH = "4b2be757c3f1e284ab3cc331f514e22478c3f0ba1cacec65de146b997041f602199ce0af468939aac6d30efb7048adccb019706a3b682e4cf532021eb988b007"

RPROVIDES:${PN} += "primecount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libprimecount.so.7 \
libprimesieve.so.11 \
libstdc++.so.6"

inherit rpm
