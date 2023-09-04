SUMMARY = "Implementations of the SHA suite of message digest functions"
DESCRIPTION = "This library implements the SHA suite of message digest functions, according to \
NIST FIPS 180-2 (with the SHA-224 addendum), as well as the SHA-based HMAC \
routines. The functions have been tested against most of the NIST and RFC test \
vectors for the various functions. While some attention has been paid to \
performance, these do not presently reach the speed of well-tuned libraries, \
like OpenSSL."
LICENSE = "BSD-3-Clause"

PV = "1.6.4.4"

RPM_NAME = "ghc-SHA-1.6.4.4-8.3.aarch64.rpm"
RPM_HASH = "1ddec1a7f52a7c2c54a699ae397bf77502f3971d3ac0efe142cb795b57c22f10fe7322911b4d256688d1b3e015c2d4bcaf096a5c1a0729fde53478a19069cee9"

RPROVIDES:${PN} += "ghc-SHA \
libHSSHA-1.6.4.4-ECOkYIcPN6aC9icBjFCZ1l-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
