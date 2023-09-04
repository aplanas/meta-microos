SUMMARY = "Lift a type from a Typeable constraint to a Template Haskell type"
DESCRIPTION = "Lift your types from a Typeable constraint to a Template Haskell type."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-lift-type-0.1.1.1-2.3.aarch64.rpm"
RPM_HASH = "a54fcb019b6a26f89c78703efe93e86676be8206a35c2670fda9d937d9f31dda388c7b7b2c009b39f50a07718358c2e07aa63c92cc2ce9dccd62d92ed3e76cf3"

RPROVIDES:${PN} += "ghc-lift-type \
libHSlift-type-0.1.1.1-4CMQtv7szwz8L9BvxxqTk1-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
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
