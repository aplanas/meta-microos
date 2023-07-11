SUMMARY = "A prime number generator"
DESCRIPTION = "primesieve is a command-line program that generates primes using the \
sieve of Eratosthenes algorithm. It can generate primes and prime \
k-tuplets (twin primes, prime triplets, ...) up to 2^64 and find the \
nth prime."
LICENSE = "BSD-2-Clause"

PV = "11.1"

RPM_NAME = "primesieve-11.1-1.2.aarch64.rpm"
RPM_HASH = "50b52e64dbac2f4dfc8368096105f6ceffb1b8853f5b7d583bd02f0c1f62136a5c941f24063bb92b0d7a533ca026f5f5a78e60bc33a76ff7abdbb6537c456d57"

RPROVIDES:${PN} += "primesieve"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libprimesieve.so.11 \
libstdc++.so.6"

inherit rpm
