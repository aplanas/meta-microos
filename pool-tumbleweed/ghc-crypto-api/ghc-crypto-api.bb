SUMMARY = "A generic interface for cryptographic operations"
DESCRIPTION = "A generic interface for cryptographic operations (hashes, ciphers, randomness). \
Maintainers of hash and cipher implementations are encouraged to add instances \
for the classes defined in Crypto.Classes. Crypto users are similarly \
encouraged to use the interfaces defined in the Classes module. Any concepts or \
functions of general use to more than one cryptographic algorithm (ex: padding) \
is within scope of this package."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-0.13.3-5.9.aarch64.rpm"
RPM_HASH = "b5656189aefeb60277804f628be51a35017b81595c078a60ba834f435766142d09c6eb496f80e7371e1404a8a1b02d5dbf19b6df3c26dbbcd29ec7c528691c6b"

RPROVIDES:${PN} += "ghc-crypto-api \
libHScrypto-api-0.13.3-2rX3thRbGDW3ZR7H62fg4Z-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSentropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
