SUMMARY = "Haskell HsYAML profiling library"
DESCRIPTION = "This package provides the Haskell HsYAML profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-prof-0.2.1.1-4.1.aarch64.rpm"
RPM_HASH = "e018b67b4d904c6fe584db6ed1ae474b15f295ac4cb250fa56aa6cfbce9c0cda9b74f564ca43d736205db1305750f8c9ca7004b5521b40ae23cf6c51f941c869"

RPROVIDES:${PN} += "ghc-HsYAML-prof \
ghc-prof-HsYAML-0.2.1.1-KzoQvRN4UKW2jR1yND83sf"

RDEPENDS:${PN} += "ghc-HsYAML-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
