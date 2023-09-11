SUMMARY = "Haskell ghc-lib-parser profiling library"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.7.20230826"

RPM_NAME = "ghc-ghc-lib-parser-prof-9.4.7.20230826-1.1.aarch64.rpm"
RPM_HASH = "95a295fa3e1aea129b6bcb7cc5381c6b84883c5e99f170e574b5bf64c0048314f0f0bec26b46500571eef616e4b352997340e8f6db6dc835c781e2c03fb7a1c2"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-prof \
ghc-prof-ghc-lib-parser-9.4.7.20230826-9jTyF2CzAjoBitf2gKlSVU"

RDEPENDS:${PN} += "ghc-ghc-lib-parser-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-process-1.6.17.0 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3"

inherit rpm
