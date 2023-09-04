SUMMARY = "Haskell transformers-compat profiling library"
DESCRIPTION = "This package provides the Haskell transformers-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-prof-0.7.2-2.8.aarch64.rpm"
RPM_HASH = "ed8cfcebcf5ac8882f60bbedaca1bea8883f558d55812f4438594148794d3583a0a78961ce4bb0e7ca78cb2aa715e4357ac815fc9ffff936bdd8121f916f8b26"

RPROVIDES:${PN} += "ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-transformers-compat-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-transformers-0.5.6.2 \
ghc-transformers-compat-devel"

inherit rpm
