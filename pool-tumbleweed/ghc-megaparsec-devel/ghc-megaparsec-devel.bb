SUMMARY = "Haskell megaparsec library development files"
DESCRIPTION = "This package provides the Haskell megaparsec library development files."
LICENSE = "BSD-2-Clause"

PV = "9.3.1"

RPM_NAME = "ghc-megaparsec-devel-9.3.1-1.3.aarch64.rpm"
RPM_HASH = "deab30fdd9d86d36ed0e9055ff5d4495d874e43c911d2d59fc113179231eb41ef6bd18d55599e1f92e873ac78c6aa814461a648fcdd039e15212197c1fcb2621"

RPROVIDES:${PN} += "ghc-devel-megaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr \
ghc-megaparsec-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-megaparsec"

inherit rpm
