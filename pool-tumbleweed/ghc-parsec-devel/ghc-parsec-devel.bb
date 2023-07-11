SUMMARY = "Haskell parsec library development files"
DESCRIPTION = "This package provides the Haskell parsec library development files."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-devel-3.1.16.1-3.2.aarch64.rpm"
RPM_HASH = "0848bcbc0af7608b3198f302c623c33c63fcb1eeb8f29bca48c32fca6e5800a1b8960e2319520169d139102d55d2acaa0325d9d1df851014aecce0f5ed8866db"

RPROVIDES:${PN} += "ghc-devel-parsec-3.1.16.1 \
ghc-parsec-devel \
ghc-parsec-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-parsec"

inherit rpm
