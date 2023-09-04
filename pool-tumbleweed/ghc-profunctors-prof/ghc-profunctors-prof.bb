SUMMARY = "Haskell profunctors profiling library"
DESCRIPTION = "This package provides the Haskell profunctors profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.6.2"

RPM_NAME = "ghc-profunctors-prof-5.6.2-4.9.aarch64.rpm"
RPM_HASH = "e1453c7fb7a11a890023bef6720b0519e1f66f7e7afd0200a51b320d9cb9ea8bb9d3f4664557d9b660fa8de463efcf3e3a9745226bacfdecee50c7f9bc93998f"

RPROVIDES:${PN} += "ghc-prof-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-profunctors-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-prof-bifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY \
ghc-prof-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-prof-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-prof-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-transformers-0.5.6.2 \
ghc-profunctors-devel"

inherit rpm
