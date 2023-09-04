SUMMARY = "Haskell bifunctors profiling library"
DESCRIPTION = "This package provides the Haskell bifunctors profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.5.15"

RPM_NAME = "ghc-bifunctors-prof-5.5.15-1.9.aarch64.rpm"
RPM_HASH = "fbd4581ca326d5ad438bb40c235ded8dfaca7c8752f9760f232fae09d1915f55c50a79e74e5cad683b68264b0439ad1975b763727745a7f1888834b71c52fc14"

RPROVIDES:${PN} += "ghc-bifunctors-prof \
ghc-prof-bifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY"

RDEPENDS:${PN} += "ghc-bifunctors-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-prof-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-prof-containers-0.6.7 \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-prof-transformers-0.5.6.2"

inherit rpm
