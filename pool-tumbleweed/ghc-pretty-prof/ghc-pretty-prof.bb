SUMMARY = "Haskell pretty profiling library"
DESCRIPTION = "This package provides the Haskell pretty profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-prof-1.1.3.6-3.1.aarch64.rpm"
RPM_HASH = "83bd42495a1cf7fb88089b95c2475f7927f87da1c0a64d5ca3d7bfd2f34fa758972c4473a7fa43300af1f824a1cfec291d65fcc2b3d2e6be6f6de6a576c96392"

RPROVIDES:${PN} += "ghc-pretty-prof \
ghc-pretty-prof(aarch-64) \
ghc-prof(pretty-1.1.3.6)"

RDEPENDS:${PN} += "ghc-pretty-devel(aarch-64) \
ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(ghc-prim-0.9.0)"

inherit rpm
