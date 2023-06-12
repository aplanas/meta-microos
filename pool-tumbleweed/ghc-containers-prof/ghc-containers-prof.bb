SUMMARY = "Haskell containers profiling library"
DESCRIPTION = "This package provides the Haskell containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-prof-0.6.7-3.1.aarch64.rpm"
RPM_HASH = "d83343b5ed78f8b27d546d7cac07af82f3a2f3641787bf8f73c0b5850f3510ec91ecd5c52321db630302aa8a60ab9e36d60538a6ef6166cd261bb32fa2df5acb"

RPROVIDES:${PN} += "ghc-containers-prof \
ghc-containers-prof(aarch-64) \
ghc-prof(containers-0.6.7)"
RDEPENDS:${PN} += "ghc-containers-devel(aarch-64) \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(template-haskell-2.19.0.0)"

inherit rpm
