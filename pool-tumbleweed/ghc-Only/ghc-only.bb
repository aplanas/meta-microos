SUMMARY = "The 1-tuple type or single-value 'collection'"
DESCRIPTION = "This package provides a canonical anonymous 1-tuple type missing from Haskell \
for attaching typeclass instances. \
 \
NOTE: There is also the </package/OneTuple OneTuple package> which by using a \
boxed 'data'-type provides a 1-tuple type which has laziness properties which \
are more faithful to the ones of Haskell's native tuples; whereas the primary \
purpose of 'Only' is to provide the traditionally so named type-wrapper for \
attaching typeclass instances."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-Only-0.1-6.1.aarch64.rpm"
RPM_HASH = "32ba9fee26ae8e3ebe9152913679853513ba791639f4c8bc0df2ef88605a9230f4633769699d8b02b51f5b4e1027428b6f55e46a05726aaa0f98f960cfeb89bd"

RPROVIDES:${PN} += "ghc-Only \
libHSOnly-0.1-qCrN026ulaL2ZFxnlcrV1-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
