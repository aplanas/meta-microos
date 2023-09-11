SUMMARY = "Haskell ghc-lib-parser library development files"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.7.20230826"

RPM_NAME = "ghc-ghc-lib-parser-devel-9.4.7.20230826-1.1.aarch64.rpm"
RPM_HASH = "58a39608f923d69ed6ba8c87a8d086d1cbcb37d55c9b648dab66711066a21a0aca64fda53ca9a1e29d83c6f7bc1f6377dd508498fd5a040395ec4d00b1238a0b"

RPROVIDES:${PN} += "ghc-devel-ghc-lib-parser-9.4.7.20230826-9jTyF2CzAjoBitf2gKlSVU \
ghc-ghc-lib-parser-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-process-1.6.17.0 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-ghc-lib-parser"

inherit rpm
