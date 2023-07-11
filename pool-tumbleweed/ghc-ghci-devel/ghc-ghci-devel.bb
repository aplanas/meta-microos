SUMMARY = "Haskell ghci library development files"
DESCRIPTION = "This package provides the Haskell ghci library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghci-devel-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "9376e0f57c93298dd6286090873859bfd14b7125b25274113a06b42af3addccf1d360b44653e51788ca24824df2c8fc541418d25167fe0a70ba0c6a90e118ea2"

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
