SUMMARY = "Haskell ghci profiling library"
DESCRIPTION = "This package provides the Haskell ghci profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghci-prof-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "93eec7faedfdec2e51e989855c64c394e56c2d304d26fe10aceaa99935aa79ec1968f5e1da629b02153394653a30513cb79f4b65a9659f014ae5313c45aafe85"

RPROVIDES:${PN} += "ghc-ghci-prof \
ghc-prof-ghci-9.4.6"

RDEPENDS:${PN} += "ghc-ghci-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-boot-9.4.6 \
ghc-prof-ghc-heap-9.4.6 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-rts-1.0.2 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3"

inherit rpm
