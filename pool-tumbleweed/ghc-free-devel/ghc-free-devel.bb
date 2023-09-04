SUMMARY = "Haskell free library development files"
DESCRIPTION = "This package provides the Haskell free library development files."
LICENSE = "BSD-3-Clause"

PV = "5.1.10"

RPM_NAME = "ghc-free-devel-5.1.10-2.9.aarch64.rpm"
RPM_HASH = "67f656864b23e8a80faff200734b638e92707bb69ff09698aedc48d960f4dcc6564d6adbe1fdd613c7a8b5add19f6790dc9a5db083649a40c67b0dc7a145198e"

RPROVIDES:${PN} += "ghc-devel-free-5.1.10-8DOWW3JiZaX7obxPZwBWX0 \
ghc-free-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-devel-containers-0.6.7 \
ghc-devel-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-devel-exceptions-0.10.5 \
ghc-devel-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-devel-mtl-2.2.2 \
ghc-devel-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-devel-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-free"

inherit rpm
