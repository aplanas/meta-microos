SUMMARY = "Simple and incomplete pure haskell implementation of linear algebra"
DESCRIPTION = "This library is simply collection of linear-algebra related modules split from \
statistics library."
LICENSE = "BSD-2-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-dense-linear-algebra-0.1.0.0-3.9.aarch64.rpm"
RPM_HASH = "e90ba61a2885e62b1da9f1a8c0b3439549292e298ea086d1397cffbcad765a96ff670642978cc2aaffd3d838d974ad67629df6bf0e4cbc0e439e260979f0a34f"

RPROVIDES:${PN} += "ghc-dense-linear-algebra \
libHSdense-linear-algebra-0.1.0.0-FqLdJ2617mhFbXxVUig9Jj-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbitvec-1.1.5.0-4n2vDaVO5x4GAoTGOlyPxS-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmath-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr-ghc9.4.6.so \
libHSvector-binary-instances-0.2.5.2-DYVTg98S1IFCZ0TRySxTVW-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libHSvector-th-unbox-0.2.2-4Hl5syaTqnL4b2rNrCiqzQ-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
