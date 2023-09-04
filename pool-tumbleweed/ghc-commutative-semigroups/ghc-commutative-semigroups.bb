SUMMARY = "Commutative semigroups"
DESCRIPTION = "A commutative semigroup is a semigroup where the order of arguments to mappend \
does not matter."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-commutative-semigroups-0.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "0b81f000cf8c10dfbf034637648190515f36dc2314db391af92a4d2251d21212e8e7825028a08aac5f566a70dc024a68a9950c4ad2a0b599b71a0848d2b97203"

RPROVIDES:${PN} += "ghc-commutative-semigroups \
libHScommutative-semigroups-0.1.0.1-FXGRW7J4Pkn3IC4oHvkHyd-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
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
