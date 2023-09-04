SUMMARY = "Haskell pretty library development files"
DESCRIPTION = "This package provides the Haskell pretty library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-devel-1.1.3.6-1.1.aarch64.rpm"
RPM_HASH = "98a8b07c90340a8fa7a9bb6e6adbbf56335c325eebefeeef8ae044421f7291fd2b2d302ac4e98fb6c20fcbb7cbb2e8ac101b399bed7d260b56e85a067e480e13"

RPROVIDES:${PN} += "ghc-devel-pretty-1.1.3.6 \
ghc-pretty-devel \
ghc-pretty-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-pretty"

inherit rpm
