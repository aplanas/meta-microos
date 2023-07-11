SUMMARY = "Haskell text library development files"
DESCRIPTION = "This package provides the Haskell text library development files."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-devel-2.0.2-3.2.aarch64.rpm"
RPM_HASH = "3df240fd5f559acc98ac7abea279130d7bb1359e635ff6aa5f0cb5c6d90629df66026d20604ef7fd7943ace883b0638dfe1913f169e64c8b26df867bd0138058"

RPROVIDES:${PN} += "ghc-devel-text-2.0.2 \
ghc-text-devel \
ghc-text-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-text"

inherit rpm
