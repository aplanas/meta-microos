SUMMARY = "Haskell binary library"
DESCRIPTION = "This package provides the Haskell binary library."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-0.8.9.1-1.1.aarch64.rpm"
RPM_HASH = "fc7c7ee2062eb662618b2c3b43dada8ce457068677389cb6d75eebfb8a8cb6654de117423560842afc09772c07128a76c429de857faf965fbe50a236b7966321"

RPROVIDES:${PN} += "ghc-binary \
libHSbinary-0.8.9.1-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
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
