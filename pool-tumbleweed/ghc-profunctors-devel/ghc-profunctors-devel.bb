SUMMARY = "Haskell profunctors library development files"
DESCRIPTION = "This package provides the Haskell profunctors library development files."
LICENSE = "BSD-3-Clause"

PV = "5.6.2"

RPM_NAME = "ghc-profunctors-devel-5.6.2-4.9.aarch64.rpm"
RPM_HASH = "011c19e4a7c37d0f7deea066dc9efbd3a235a293387b7ecaf274095d0e0a5eb10aa0a3c606e8a5c1b3c3007ba29b93eff1a98355a103ac44663da4ea048429d6"

RPROVIDES:${PN} += "ghc-devel-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-profunctors-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-devel-bifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY \
ghc-devel-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-devel-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-devel-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-transformers-0.5.6.2 \
ghc-profunctors"

inherit rpm
