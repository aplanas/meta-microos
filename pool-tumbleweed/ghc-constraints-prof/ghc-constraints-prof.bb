SUMMARY = "Haskell constraints profiling library"
DESCRIPTION = "This package provides the Haskell constraints profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.13.4"

RPM_NAME = "ghc-constraints-prof-0.13.4-3.2.aarch64.rpm"
RPM_HASH = "cf1c1cd261e79c1882120ba2e6b0b26a19419c3ef99341bf55c4798b0196d27ad5b78fb1c90d8a5049de956e1bb40b98a6527209be70cb8a3dcf1e6596446164"

RPROVIDES:${PN} += "ghc-constraints-prof \
ghc-prof-constraints-0.13.4-7HFJx00f7ri8MCLIfNZmvk"

RDEPENDS:${PN} += "ghc-constraints-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-mtl-2.2.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-prof-type-equality-1-GeDZojRKCH6645jDbV5JLU"

inherit rpm
