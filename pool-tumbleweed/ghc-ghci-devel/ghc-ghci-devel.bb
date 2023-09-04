SUMMARY = "Haskell ghci library development files"
DESCRIPTION = "This package provides the Haskell ghci library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghci-devel-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "d847010eb6690f0ce1ba3e2a2781b26774de56dca38ff66d6edaa4b627c463bb16566718b7c7b51eea7c1110b703962f9319c471a6c8bcada213801bea1b4641"

RPROVIDES:${PN} += "ghc-devel-ghci-9.4.6 \
ghc-ghci-devel \
ghc-ghci-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-boot-9.4.6 \
ghc-devel-ghc-heap-9.4.6 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-rts-1.0.2 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-ghci"

inherit rpm
