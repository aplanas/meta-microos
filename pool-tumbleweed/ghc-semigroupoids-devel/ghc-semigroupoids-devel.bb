SUMMARY = "Haskell semigroupoids library development files"
DESCRIPTION = "This package provides the Haskell semigroupoids library development files."
LICENSE = "BSD-2-Clause"

PV = "5.3.7"

RPM_NAME = "ghc-semigroupoids-devel-5.3.7-2.10.aarch64.rpm"
RPM_HASH = "ae9a998c65efcbf0a712d0bdf384250e586d10f119c4674eafb64304da9e15ba41a0a359056ab0f7f329cdc634ed58df08369cd3ee8aaea1eb3afbe628fb45d9"

RPROVIDES:${PN} += "ghc-devel-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-semigroupoids-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-devel-bifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY \
ghc-devel-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-devel-containers-0.6.7 \
ghc-devel-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-devel-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-semigroupoids"

inherit rpm
