SUMMARY = "Haskell ghc-heap library development files"
DESCRIPTION = "This package provides the Haskell ghc-heap library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-heap-devel-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "2eda86e0139926ad0293ffd735c712a2ae16b0dae1ffbc5689c6244c593f6d249765c5f6e12dd3508a91e1cdc0c6305a8d47f2da8f1d2022fce6549d224cbdd5"

RPROVIDES:${PN} += "ghc-devel-ghc-heap-9.4.5 \
ghc-ghc-heap-devel \
ghc-ghc-heap-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-rts-1.0.2 \
ghc-ghc-heap"

inherit rpm
