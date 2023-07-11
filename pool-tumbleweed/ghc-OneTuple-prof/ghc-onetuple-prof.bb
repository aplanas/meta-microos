SUMMARY = "Haskell OneTuple profiling library"
DESCRIPTION = "This package provides the Haskell OneTuple profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-OneTuple-prof-0.4.1.1-1.2.aarch64.rpm"
RPM_HASH = "10977702e537a42a45fc67b3578c3085659bb0f561b70dc7a93118493a269d641ae938c642958057ccf5a6cb67731e022e2d0945acb80c7d069e446de34aaeae"

RPROVIDES:${PN} += "ghc-OneTuple-prof \
ghc-prof-OneTuple-0.4.1.1-Fgk8ylTtnzLBSBvZAI1OoV"

RDEPENDS:${PN} += "ghc-OneTuple-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-template-haskell-2.19.0.0"

inherit rpm
