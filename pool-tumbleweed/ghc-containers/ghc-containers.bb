SUMMARY = "Haskell containers library"
DESCRIPTION = "This package provides the Haskell containers library."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-0.6.7-1.1.aarch64.rpm"
RPM_HASH = "f59716f523aeb29c5b7bb876af94a847f94ca3a8a3fe9f2c9d98ae7a7538e01f37c9a5bbe7e4a99aee4d5d1cf983c5b0a0f631a24082b424ada94bff3836ad0d"

RPROVIDES:${PN} += "ghc-containers \
libHScontainers-0.6.7-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
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
