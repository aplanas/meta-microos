SUMMARY = "Haskell free profiling library"
DESCRIPTION = "This package provides the Haskell free profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.1.10"

RPM_NAME = "ghc-free-prof-5.1.10-2.9.aarch64.rpm"
RPM_HASH = "3209b51aa746128ec994340882fbbbebb26a73fb4879c4b51e756559fce24e34119dc3ae8177fbd18eb64fa742f32b48a11a23f898e429b5258b24e7c6809c69"

RPROVIDES:${PN} += "ghc-free-prof \
ghc-prof-free-5.1.10-8DOWW3JiZaX7obxPZwBWX0"

RDEPENDS:${PN} += "ghc-free-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-prof-containers-0.6.7 \
ghc-prof-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-prof-exceptions-0.10.5 \
ghc-prof-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-prof-mtl-2.2.2 \
ghc-prof-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-prof-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44"

inherit rpm
