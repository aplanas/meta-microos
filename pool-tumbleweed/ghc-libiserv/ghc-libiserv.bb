SUMMARY = "Haskell libiserv library"
DESCRIPTION = "This package provides the Haskell libiserv library."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-libiserv-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "8d696a9937145013c1166f8ce52a4fc8bd85686434d5e03678d8aca5a54365d9c5c14b0355daa5147adfc53511b45ad39cf5b43166fc5465640e064b7dbc49d7"

RPROVIDES:${PN} += "ghc-libiserv \
libHSlibiserv-9.4.6-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-9.4.6-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-heap-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSghci-9.4.6-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
