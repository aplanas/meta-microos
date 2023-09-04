SUMMARY = "Haskell monad-control profiling library"
DESCRIPTION = "This package provides the Haskell monad-control profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.3.1"

RPM_NAME = "ghc-monad-control-prof-1.0.3.1-2.3.aarch64.rpm"
RPM_HASH = "5219abdc6b92189775c08a07e286722561b18132e8cdeba72adcf95b388fa9162cf46734b848e33bc069919ef83c82d98d58ec129817fb76f5a41ec9fea7a86e"

RPROVIDES:${PN} += "ghc-monad-control-prof \
ghc-prof-monad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B"

RDEPENDS:${PN} += "ghc-monad-control-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM"

inherit rpm
