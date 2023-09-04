SUMMARY = "Efficient, purely functional generation of prime numbers"
DESCRIPTION = "This Haskell library provides an efficient lazy wheel sieve for prime \
generation inspired by /Lazy wheel sieves and spirals of/ /primes/ by Colin \
Runciman and /The Genuine Sieve of Eratosthenes/ by Melissa O'Neil."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-primes-0.2.1.0-1.3.aarch64.rpm"
RPM_HASH = "c8f16543feca18a42b173fb6f948bb7e58149f8d32b2773a28d770133fa24a35e95a0915c9e6f7f22ac28b13b8f81049ecccb2a53e501566d60d62af697518eb"

RPROVIDES:${PN} += "ghc-primes \
libHSprimes-0.2.1.0-Gyap6mKLPxs4D6ga1tuZTq-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
