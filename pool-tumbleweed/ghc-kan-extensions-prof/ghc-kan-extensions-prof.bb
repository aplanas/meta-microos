SUMMARY = "Haskell kan-extensions profiling library"
DESCRIPTION = "This package provides the Haskell kan-extensions profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.2.5"

RPM_NAME = "ghc-kan-extensions-prof-5.2.5-2.9.aarch64.rpm"
RPM_HASH = "4a2403717f8f7c1072fc6a274fddf0f1842e9442dd5f3ecf60c9960a6f3299af00d50114502e09985e6390fbfbaf53681f762c837fdeb3b1a871f6b813ff03f7"

RPROVIDES:${PN} += "ghc-kan-extensions-prof \
ghc-prof-kan-extensions-5.2.5-8EOcrvzPSBS2QFPhIHEfWy"

RDEPENDS:${PN} += "ghc-kan-extensions-devel \
ghc-prof-adjunctions-4.4.2-BjNTDSboJHWDpWX9BvuZL3 \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-prof-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-prof-free-5.1.10-8DOWW3JiZaX7obxPZwBWX0 \
ghc-prof-invariant-0.6.2-1eF4QVqz69AFovgmNz4wk7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-prof-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM"

inherit rpm
