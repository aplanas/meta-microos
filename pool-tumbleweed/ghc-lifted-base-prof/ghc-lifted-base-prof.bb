SUMMARY = "Haskell lifted-base profiling library"
DESCRIPTION = "This package provides the Haskell lifted-base profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-prof-0.2.3.12-8.8.aarch64.rpm"
RPM_HASH = "ed5a4ca9440775b3d73a1b6641263545177a823d9ef8eb0cb03f98a5c36fde6418555979cc5312cf0376ea9eeb675e803146559aa18c95c9972f702efd6efb00"

RPROVIDES:${PN} += "ghc-lifted-base-prof \
ghc-prof-lifted-base-0.2.3.12-8AMs8PuCeaLKJwoieZv4GI"

RDEPENDS:${PN} += "ghc-lifted-base-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-monad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B \
ghc-prof-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44"

inherit rpm
