SUMMARY = "Haskell hscolour library"
DESCRIPTION = "This package provides the Haskell hscolour shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "ghc-hscolour-1.24.4-4.8.aarch64.rpm"
RPM_HASH = "b2a6643b5c3349c46368d87f9c3b7ff5354c819e0780d69e6535af48767c5325c802969a9084b20f3a372d1d8747ea1c892ebd69d191b0345a9dce48a52f1bf7"

RPROVIDES:${PN} += "ghc-hscolour \
libHShscolour-1.24.4-LJeKwNXAf207wSFk6wkP8w-ghc9.4.6.so"

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
