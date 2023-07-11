SUMMARY = "Haskell hscolour library"
DESCRIPTION = "This package provides the Haskell hscolour shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "ghc-hscolour-1.24.4-4.6.aarch64.rpm"
RPM_HASH = "aaae931f6ae5faa2bcfd3f8c678be16700dca442f912a0e3e29be3e4ad6a9d6b08e11182437e3b852ba965f945db8e8a2effb9930c9813e633398929cce7435a"

RPROVIDES:${PN} += "ghc-hscolour \
libHShscolour-1.24.4-B0NmEhYuPI790UQrsiXLka-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
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
