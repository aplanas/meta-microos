SUMMARY = "Haskell ghci profiling library"
DESCRIPTION = "This package provides the Haskell ghci profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghci-prof-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "bb24f5d911cd88cb3d2b1284e721de911f8650f485957c8f9718b74ea243af8c9270194ba80291d4d16c3b4850692b8192a9d3bc9a26879ba739574fd188b0cf"

RPROVIDES:${PN} += "ghc-ghci-prof \
ghc-prof-ghci-9.4.5"

RDEPENDS:${PN} += "ghc-ghci-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-boot-9.4.5 \
ghc-prof-ghc-heap-9.4.5 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-rts-1.0.2 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3"

inherit rpm
