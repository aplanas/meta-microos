SUMMARY = "Haskell directory library"
DESCRIPTION = "This package provides the Haskell directory library."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-1.3.7.1-3.1.aarch64.rpm"
RPM_HASH = "a925d6760f6196d01f9605d20aae91b202f488190997967e5c65e323c30af3da1fee9e270d7ec3756f9f4c00f5618cf9635b6e73375508dbeba40f8c7bd1734c"

RPROVIDES:${PN} += "ghc-directory \
libHSdirectory-1.3.7.1-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
