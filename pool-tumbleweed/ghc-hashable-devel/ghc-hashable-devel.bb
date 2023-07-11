SUMMARY = "Haskell hashable library development files"
DESCRIPTION = "This package provides the Haskell hashable library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.0"

RPM_NAME = "ghc-hashable-devel-1.4.2.0-1.5.aarch64.rpm"
RPM_HASH = "5e22f8e10b5b0954e77d7785397e8b8f3692e2a73e17b45f626b22a22be8e9f58e0f839fe5f8617bd8d384debafe1345df07f403cc75aa8d43cb4c7808f8bcef"

RPROVIDES:${PN} += "ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-hashable-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-bignum-1.3 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-text-2.0.2 \
ghc-hashable"

inherit rpm
