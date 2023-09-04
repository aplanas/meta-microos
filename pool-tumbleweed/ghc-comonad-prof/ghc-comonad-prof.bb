SUMMARY = "Haskell comonad profiling library"
DESCRIPTION = "This package provides the Haskell comonad profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.0.8"

RPM_NAME = "ghc-comonad-prof-5.0.8-3.9.aarch64.rpm"
RPM_HASH = "c843ee8703193b25a62212f4ed74147b64421faa9d34c6cf3f317d48f6d9074c3d8a1ee83b34441bd730d003d9f658088e776af376bac2df6d4970bd412d98cc"

RPROVIDES:${PN} += "ghc-comonad-prof \
ghc-prof-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E"

RDEPENDS:${PN} += "ghc-comonad-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-prof-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM"

inherit rpm
