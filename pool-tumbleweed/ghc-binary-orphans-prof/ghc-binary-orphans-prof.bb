SUMMARY = "Haskell binary-orphans profiling library"
DESCRIPTION = "This package provides the Haskell binary-orphans profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.4.1"

RPM_NAME = "ghc-binary-orphans-prof-1.0.4.1-1.3.aarch64.rpm"
RPM_HASH = "46e57c97f706f6be2ea3a780883d137b27c5b1b7f4fddf97f49ccacef7322475f5f8816363b5e688831d84c6d7b32e682d762e5e048e6985a207aa1ea2990347"

RPROVIDES:${PN} += "ghc-binary-orphans-prof \
ghc-prof-binary-orphans-1.0.4.1-8AxRlqguR7DABM6SJeuldT"

RDEPENDS:${PN} += "ghc-binary-orphans-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
