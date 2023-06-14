SUMMARY = "Haskell implementation of the Unicode Collation Algorithm"
DESCRIPTION = "This library provides a pure Haskell implementation of the Unicode Collation \
Algorithm described at <http://www.unicode.org/reports/tr10/>. It is not as \
fully-featured or as performant as 'text-icu', but it avoids a dependency on a \
large C library. Locale-specific tailorings are also provided."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.4"

RPM_NAME = "ghc-unicode-collation-0.1.3.4-1.3.aarch64.rpm"
RPM_HASH = "c59837d62fd8239d40f82816eea4856cf6098b295b7cd023926c2d71f3780c8c6a1c6a44156cb40a5bea16a865da2432f3a6369f84b93f99f11aa6a689598e6d"

RPROVIDES:${PN} += "ghc-unicode-collation \
libHSunicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so \
libHSth-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN-ghc9.4.5.so \
libHSth-lift-instances-0.1.20-7156sTBHd79IaWXpYE3Pjx-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
