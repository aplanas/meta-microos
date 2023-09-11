SUMMARY = "Subclasses of Monoid"
DESCRIPTION = "A hierarchy of subclasses of 'Monoid' together with their instances for all \
data structures from base, containers, and text packages."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "ghc-monoid-subclasses-1.2.4-1.1.aarch64.rpm"
RPM_HASH = "64d253be7aa047a9021bb6e72658bf90be7b4534f1bd9f77d1e2ac197899cd306fb0b7abf0a46e4f3773b2ee1b6dc03cee45c1f3746a0736c5ffee41bc14edf7"

RPROVIDES:${PN} += "ghc-monoid-subclasses \
libHSmonoid-subclasses-1.2.4-19X6M9mjCjC7gPD9QVvKTU-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScommutative-semigroups-0.1.0.1-FXGRW7J4Pkn3IC4oHvkHyd-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimes-0.2.1.0-Gyap6mKLPxs4D6ga1tuZTq-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
