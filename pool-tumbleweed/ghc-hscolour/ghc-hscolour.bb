SUMMARY = "Haskell hscolour library"
DESCRIPTION = "This package provides the Haskell hscolour shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "ghc-hscolour-1.24.4-4.3.aarch64.rpm"
RPM_HASH = "3f63b18eabd419e7cae7d9242674284f5151323470418c0ba1b989b379cd70559dacda413aee0cd6a361f07c66f0311fb37aec868438bc82759079927057fc21"

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
