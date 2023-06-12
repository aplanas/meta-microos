SUMMARY = "Implementations of the SHA suite of message digest functions"
DESCRIPTION = "This library implements the SHA suite of message digest functions, according to \
NIST FIPS 180-2 (with the SHA-224 addendum), as well as the SHA-based HMAC \
routines. The functions have been tested against most of the NIST and RFC test \
vectors for the various functions. While some attention has been paid to \
performance, these do not presently reach the speed of well-tuned libraries, \
like OpenSSL."
LICENSE = "BSD-3-Clause"

PV = "1.6.4.4"

RPM_NAME = "ghc-SHA-1.6.4.4-8.2.aarch64.rpm"
RPM_HASH = "0955322a072fbda100c637c3b24ab19a658d537c451df7ff1a69d3841a047352277050308e9b0dfb05c750e06151e8dcc789ef6c2f6950fb18b662a06d8891ab"

RPROVIDES:${PN} += "ghc-SHA \
ghc-SHA(aarch-64) \
libHSSHA-1.6.4.4-CTRZ9m1gmyY35Z2xnCckJW-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm