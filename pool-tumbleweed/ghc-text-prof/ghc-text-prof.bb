SUMMARY = "Haskell text profiling library"
DESCRIPTION = "This package provides the Haskell text profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-prof-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "c68ce4cbbab4724e6ad8be4e440a7e1a4647fae715c963a5bc2d0871927978945ade2a3408dccb5c98676b1413a2146a9600ddc41cbd081ad27124ba6fd01527"

RPROVIDES:${PN} += "ghc-prof-text-2.0.2 \
ghc-text-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-text-devel"

inherit rpm
