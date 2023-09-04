SUMMARY = "Haskell text-zipper profiling library"
DESCRIPTION = "This package provides the Haskell text-zipper profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.12"

RPM_NAME = "ghc-text-zipper-prof-0.12-2.3.aarch64.rpm"
RPM_HASH = "f0b495c4cae928f5381d454491104c1cedfa3a58eaa3809527c60b3bf39365752e1596c0f3646049a9046c071bc0aa6441766cd3e7a95ac888265c04ec9914fa"

RPROVIDES:${PN} += "ghc-prof-text-zipper-0.12-H7IYZaS5uJc9wNiAP20WIH \
ghc-text-zipper-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-text-2.0.2 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-text-zipper-devel"

inherit rpm
