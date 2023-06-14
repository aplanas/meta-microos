SUMMARY = "Haskell ghci library development files"
DESCRIPTION = "This package provides the Haskell ghci library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghci-devel-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "f49c6529f80d284078737e6204460ed8c61e04f62e5962dd7b61be678e2ba39e338cf733fcd101e7d16548fabbc155c3d8b41d6452af3e695da9b030701de3bc"

RPROVIDES:${PN} += "ghc-devel-ghci-9.4.5 \
ghc-ghci-devel \
ghc-ghci-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-boot-9.4.5 \
ghc-devel-ghc-heap-9.4.5 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-rts-1.0.2 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-ghci"

inherit rpm
