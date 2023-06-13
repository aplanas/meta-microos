SUMMARY = "A prime number generator"
DESCRIPTION = "primesieve is a command-line program that generates primes using the \
sieve of Eratosthenes algorithm. It can generate primes and prime \
k-tuplets (twin primes, prime triplets, ...) up to 2^64 and find the \
nth prime."
LICENSE = "BSD-2-Clause"

PV = "11.1"

RPM_NAME = "primesieve-11.1-1.1.aarch64.rpm"
RPM_HASH = "9744bdb9941e97b20c2e214e2ecce6c318537d4def392c3c8c4cd117e410b40d58d3e44c4175b3ff2a361a8e606f86e4f6a5f1ca6fa275c753914396ebc7fbb4"

RPROVIDES:${PN} += "primesieve \
primesieve(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libprimesieve.so.11()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
