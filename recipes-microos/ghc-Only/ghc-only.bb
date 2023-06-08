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

RPM_NAME = "ghc-Only-0.1-5.2.aarch64.rpm"
RPM_HASH = "5c2f117407bda3c4793cfbfe2307aebdd1c50f2501a2eb18c7ab0377dd8ecf10f2ae8744c36a5cf0ce4e623cbf6222b68d43ea4813915cf5d4e866337805e861"

RPROVIDES:${PN} += "ghc-Only ghc-Only(aarch-64) libHSOnly-0.1-ETd5YCT0TwGLbN8rgpgTS8-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
