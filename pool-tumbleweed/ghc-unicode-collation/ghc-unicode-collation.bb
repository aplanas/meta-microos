SUMMARY = "Haskell implementation of the Unicode Collation Algorithm"
DESCRIPTION = "This library provides a pure Haskell implementation of the Unicode Collation \
Algorithm described at <http://www.unicode.org/reports/tr10/>. It is not as \
fully-featured or as performant as 'text-icu', but it avoids a dependency on a \
large C library. Locale-specific tailorings are also provided."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.5"

RPM_NAME = "ghc-unicode-collation-0.1.3.5-1.1.aarch64.rpm"
RPM_HASH = "c8c3b1a986de4c1d6d4d59655a27cdfff3a92a804bc3992de9329489ff14a8254c47d4aa8b7c455a82d7b7ad48916701c082dde752c4387f42a1e1cac2ce0c49"

RPROVIDES:${PN} += "ghc-unicode-collation \
libHSunicode-collation-0.1.3.5-IFdGKnlU7nK53rXIDeXQnQ-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHSth-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a-ghc9.4.6.so \
libHSth-lift-instances-0.1.20-BKODVtFlRayDjKs9vGaGq3-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
