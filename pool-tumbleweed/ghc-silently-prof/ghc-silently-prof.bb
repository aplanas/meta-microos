SUMMARY = "Haskell silently profiling library"
DESCRIPTION = "This package provides the Haskell silently profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.5.3"

RPM_NAME = "ghc-silently-prof-1.2.5.3-2.3.aarch64.rpm"
RPM_HASH = "26959e6788d7ddae32753f0da9f9d30cdfea9a74ab15c1051bdffdcf5fcb55a1a6037accb4793f28042fc0cf798d20d174fb2cadb08de32a235a0f394d456fff"

RPROVIDES:${PN} += "ghc-prof-silently-1.2.5.3-DooEMl8ysOU4ZpgKypCRy8 \
ghc-silently-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-silently-devel"

inherit rpm
