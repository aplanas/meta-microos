SUMMARY = "Haskell semigroupoids profiling library"
DESCRIPTION = "This package provides the Haskell semigroupoids profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.3.7"

RPM_NAME = "ghc-semigroupoids-prof-5.3.7-2.10.aarch64.rpm"
RPM_HASH = "3ec255c868d65985d3949dc1cf6c3ca6f5bb881effe05f8f8bee40526996792f0fddd773b2d07cf6b8c74c2e7e2f56142d2b2117c92e592d74c192ced9a4f3c1"

RPROVIDES:${PN} += "ghc-prof-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-semigroupoids-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-prof-bifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY \
ghc-prof-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-prof-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-semigroupoids-devel"

inherit rpm
