SUMMARY = "Lift a type from a Typeable constraint to a Template Haskell type"
DESCRIPTION = "Lift your types from a Typeable constraint to a Template Haskell type."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-lift-type-0.1.1.1-2.2.aarch64.rpm"
RPM_HASH = "08d5a561f787d5b06976b9bd80fda1cd0b6cddb85d85aa6199669ddc82505156b25eafe82046b05aedf29dfcadf9a4890fb2351af9bc80d595801eb92f31299c"

RPROVIDES:${PN} += "ghc-lift-type \
libHSlift-type-0.1.1.1-2p47b0Ftg8mEbzaiZ22oeB-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
