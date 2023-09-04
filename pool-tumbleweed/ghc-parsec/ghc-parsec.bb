SUMMARY = "Haskell parsec library"
DESCRIPTION = "This package provides the Haskell parsec library."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-3.1.16.1-1.1.aarch64.rpm"
RPM_HASH = "eaca62599220ae2a267cd22401e491ccbff895b89d987fc8686790475777b7d3fc0485315efcf2fd12c6c5fe67acff12571c491a32dc9b5f9597fe38fa43ee26"

RPROVIDES:${PN} += "ghc-parsec \
libHSparsec-3.1.16.1-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
