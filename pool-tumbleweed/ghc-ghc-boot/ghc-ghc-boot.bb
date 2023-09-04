SUMMARY = "Haskell ghc-boot library"
DESCRIPTION = "This package provides the Haskell ghc-boot library."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-boot-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "249c45c6221d6f1392853ad761451c546034b7633fa7161aec1eb3c42825385e83092b4be5ed74bc4ce192a56b4e65ca61ecc026c09dd3fd0787e6abfd80d4fd"

RPROVIDES:${PN} += "ghc-ghc-boot \
libHSghc-boot-9.4.6-ghc9.4.6.so"

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
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
