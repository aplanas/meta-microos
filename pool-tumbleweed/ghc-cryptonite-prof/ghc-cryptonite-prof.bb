SUMMARY = "Haskell cryptonite profiling library"
DESCRIPTION = "This package provides the Haskell cryptonite profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-prof-0.30-2.8.aarch64.rpm"
RPM_HASH = "3ed6ee5007850d621243fae699862545093c4d9b24c47fcb1e2dd5e2029edc9e4ac9ce988f0c8cb9b2c3c1202e3899147c53eadb6a56d0dd767121262ac2d823"

RPROVIDES:${PN} += "ghc-cryptonite-prof \
ghc-prof-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW"

RDEPENDS:${PN} += "ghc-cryptonite-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-integer-gmp-1.1 \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1"

inherit rpm
