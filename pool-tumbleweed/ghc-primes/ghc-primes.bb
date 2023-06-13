SUMMARY = "Efficient, purely functional generation of prime numbers"
DESCRIPTION = "This Haskell library provides an efficient lazy wheel sieve for prime \
generation inspired by /Lazy wheel sieves and spirals of/ /primes/ by Colin \
Runciman and /The Genuine Sieve of Eratosthenes/ by Melissa O'Neil."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-primes-0.2.1.0-1.2.aarch64.rpm"
RPM_HASH = "2faf3b47b43f8a4587aea1fe8c3cd1bb9d2ec6bd1e8ced7d6042bd38f5449a019b63deca7a079d6ca5c6263264a15975cc43bf0e0a4054256812c6b1a316435f"

RPROVIDES:${PN} += "ghc-primes \
ghc-primes(aarch-64) \
libHSprimes-0.2.1.0-EDehUtw1pOPPL7EktYCRg-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
